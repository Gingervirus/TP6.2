package com.example.armin.tp5.factories.Student;

import com.example.armin.tp5.domain.Student.StudentData;
import com.example.armin.tp5.domain.Student.StudentDetails;
import com.example.armin.tp5.factories.Detention.DetentionFactory;

/**
 * Created by Armin on 2016-05-08.
 */
public class StudentFactory {
    private String studNr;
    private String grade;
    private String marks;
    private boolean detention;
    private String name;
    private String lastName;
    private String dob;
    private String gender;
    private String cell;

    public StudentFactory() {
    }

    public StudentFactory(String studNr, String grade, String marks, boolean detention, String name, String lastName, String dob, String gender, String cell) {
        this.studNr = studNr;
        this.grade = grade;
        this.marks = marks;
        this.detention = detention;
        this.name = name;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.cell = cell;
    }

    public void setStudNr(String studNr) {
        this.studNr = studNr;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public void setDetention(boolean detention) {
        this.detention = detention;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public StudentData buildStudentData()
    {
        StudentDetails stud = new StudentDetails.Builder()
                .name("Armin")
                .lastName("Wentzel")
                .gender("Male")
                .dob("21/06/1995")
                .cell("0764805005")
                .build();
        StudentData person = new StudentData.Builder()
                .studNr("214296725")
                .studentDetails(stud)
                .marks("75#77#82#89#67#69#90")
                .detention(DetentionFactory.getDetention("YES"))
                .grade("3A")
                .build();
        return person;
    }

}
