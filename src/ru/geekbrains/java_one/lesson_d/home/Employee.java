package ru.geekbrains.java_one.lesson_d.home;

import java.util.Calendar;

public class Employee {
    private String FullName;
    private float Salary;
    private float BirthYear;
    private int Id;
    private static int LastId = 0;  //хранит порядковый номер последнего добавленного сотрудника

    Employee(String FullName, float Salary, float Age){
        setAge(Age);
        this.FullName = FullName;
        this.Salary = Salary;
        this.Id = ++LastId;             //при создании объекта присваивает следующий Id

    }

    private void setAge(float Age) {
        this.BirthYear = Calendar.getInstance().get(Calendar.YEAR) - Age;
    }
    public float getAge(){
        return Calendar.getInstance().get(Calendar.YEAR) - BirthYear;
    }

    public String getFullName() {
        return FullName;
    }
    public int getId() {
        return Id;
    }

    public float getSalary(){
        return Salary;
    }

    public void setSalary(float Salary){
        this.Salary = Salary;
    }

    void OlderFourty(){
        if (getAge() > 40){
            System.out.printf("Id: %s, FIO: %s, ZP: %.02f, age: %.0f\n",
                    Id, FullName, Salary, getAge());
        }
    }


}
