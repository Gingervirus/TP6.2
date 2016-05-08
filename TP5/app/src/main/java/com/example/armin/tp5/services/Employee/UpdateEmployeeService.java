package com.example.armin.tp5.services.Employee;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import com.example.armin.tp5.SchoolManagement;
import com.example.armin.tp5.domain.Employee.EmployeeData;
import com.example.armin.tp5.repository.Employee.EmployeeRepository;
import com.example.armin.tp5.repository.Employee.Impl.EmployeeRepositoryImpl;

public class UpdateEmployeeService extends Service {
    private EmployeeRepository repo;
    private final IBinder updateEmployee = new MyLocalBinder();

    public UpdateEmployeeService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return updateEmployee;
    }

    public EmployeeData updateEmployee(EmployeeData emp)
    {
        repo = new EmployeeRepositoryImpl(SchoolManagement.getAppContext());
        return repo.update(emp);
    }

    public class MyLocalBinder extends Binder
    {
        UpdateEmployeeService getService()
        {
            return UpdateEmployeeService.this;
        }
    }
}
