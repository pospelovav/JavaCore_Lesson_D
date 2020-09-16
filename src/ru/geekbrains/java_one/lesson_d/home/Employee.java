package ru.geekbrains.java_one.lesson_d.home;

import java.util.Calendar;

public class Employee {
    private String FullName;
    private int Salary;
    private int BirthYear;

    public Employee(String FullName, int Salary, int Age){
        setAge(Age);
        this.FullName = FullName;
        this.Salary = Salary;

    }

    private void setAge(int Age) {
        this.BirthYear = Calendar.getInstance().get(Calendar.YEAR) - Age;
    }
    public String getFullName() {
        return FullName;
    }
    public int getSalary(){
        return Salary;
    }
    public int getAge(){
        return Calendar.getInstance().get(Calendar.YEAR) - BirthYear;
    }

}
