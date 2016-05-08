package com.example.armin.tp5.services.Student;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import com.example.armin.tp5.SchoolManagement;
import com.example.armin.tp5.domain.Student.StudentData;
import com.example.armin.tp5.repository.Student.StudentRepository;
import com.example.armin.tp5.repository.Student.Impl.StudentRepositoryImpl;

import java.util.Set;

/**
 * Created by Armin on 2016-05-08.
 */
public class FindAllStudentService extends Service {
    private StudentRepository repo;
    private final IBinder findAllStudent = new MyLocalBinder();

    public FindAllStudentService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return findAllStudent;
    }

    public Set<StudentData>  findAllStudent()
    {
        repo = new StudentRepositoryImpl(SchoolManagement.getAppContext());
        return repo.findAll();
    }

    public class MyLocalBinder extends Binder
    {
        FindAllStudentService getService()
        {
            return FindAllStudentService.this;
        }
    }
}
