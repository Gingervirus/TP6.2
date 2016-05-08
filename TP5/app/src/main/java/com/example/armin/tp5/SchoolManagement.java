package com.example.armin.tp5;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SchoolManagement extends AppCompatActivity {

    private static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_management);
    }

    public static Context getAppContext() {
        return SchoolManagement.context;
    }
}
