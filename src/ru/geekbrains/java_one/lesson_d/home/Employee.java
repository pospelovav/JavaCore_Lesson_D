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
    public int getAge(){
        return Calendar.getInstance().get(Calendar.YEAR) - BirthYear;
    }
    /*
    public void setFullName(String FullName){
        this.FullName = FullName;
    }

     */
    public String getFullName() {
        return FullName;
    }

    public int getSalary(){
        return Salary;
    }

    public void setSalary(int Salary){
        this.Salary = Salary;
    }

    void OlderFourty(){
        if (getAge() > 40){
            System.out.printf("FIO: %s, ZP: %s, age: %d\n",
                    FullName, Salary, getAge());
        }
    }




}
