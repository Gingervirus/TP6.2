package com.example.armin.tp5.services.Student;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import com.example.armin.tp5.SchoolManagement;
import com.example.armin.tp5.domain.Student.StudentData;
import com.example.armin.tp5.repository.Student.StudentRepository;
import com.example.armin.tp5.repository.Student.Impl.StudentRepositoryImpl;

/**
 * Created by Armin on 2016-05-08.
 */
public class SearchStudentService extends Service {
    private StudentRepository repo;
    private final IBinder searchStudent = new MyLocalBinder();

    public SearchStudentService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return searchStudent;
    }

    public StudentData searchStudent(String emp)
    {
        repo = new StudentRepositoryImpl(SchoolManagement.getAppContext());
        return repo.findById(emp);
    }

    public class MyLocalBinder extends Binder
    {
        SearchStudentService getService()
        {
            return SearchStudentService.this;
        }
    }
}
