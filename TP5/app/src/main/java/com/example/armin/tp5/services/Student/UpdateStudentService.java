package com.example.armin.tp5.services.Student;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import com.example.armin.tp5.SchoolManagement;
import com.example.armin.tp5.domain.Student.StudentData;
import com.example.armin.tp5.repository.Student.StudentRepository;
import com.example.armin.tp5.repository.Student.Impl.StudentRepositoryImpl;

public class UpdateStudentService extends Service {
    private StudentRepository repo;
    private final IBinder updateStudent = new MyLocalBinder();

    public UpdateStudentService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return updateStudent;
    }

    public StudentData updateStudent(StudentData emp)
    {
        repo = new StudentRepositoryImpl(SchoolManagement.getAppContext());
        return repo.update(emp);
    }

    public class MyLocalBinder extends Binder
    {
        UpdateStudentService getService()
        {
            return UpdateStudentService.this;
        }
    }
}
