package ru.geekbrains.java_one.lesson_d.home;

public class Main {
    public static void main(String[] args){
        Employee Ivanov = new Employee("Ivanov Ivan", 10000, 32);
        System.out.printf("FIO: %s, age: %d\n",
                Ivanov.getFullName(), Ivanov.getAge());

    }


}
