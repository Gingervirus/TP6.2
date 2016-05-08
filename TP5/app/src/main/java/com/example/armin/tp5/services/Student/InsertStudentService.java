package com.example.armin.tp5.services.Student;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import com.example.armin.tp5.SchoolManagement;
import com.example.armin.tp5.domain.Employee.EmployeeData;
import com.example.armin.tp5.repository.Employee.EmployeeRepository;
import com.example.armin.tp5.repository.Employee.Impl.EmployeeRepositoryImpl;

/**
 * Created by Armin on 2016-05-08.
 */
public class InsertStudentService extends Service {
    private EmployeeRepository repo;
    private final IBinder insertEmployee = new MyLocalBinder();

    public InsertStudentService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return insertEmployee;
    }

    public EmployeeData insertEmployee(EmployeeData emp)
    {
        repo = new EmployeeRepositoryImpl(SchoolManagement.getAppContext());
        return repo.save(emp);
    }

    public class MyLocalBinder extends Binder
    {
        InsertStudentService getService()
        {
            return InsertStudentService.this;
        }
    }
}
