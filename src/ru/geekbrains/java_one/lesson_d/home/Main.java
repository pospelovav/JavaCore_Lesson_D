package ru.geekbrains.java_one.lesson_d.home;

public class Main {
    private static void EmployeeOlderFourty(Employee[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i].OlderFourty();
        }
    }
    public static void main(String[] args){
        Employee Ivanov = new Employee("Ivanov Ivan", 10000, 32);
        System.out.printf("FIO: %s, age: %d\n",
                Ivanov.getFullName(), Ivanov.getAge());

        Employee[] arrEmloyees = new Employee[5];
        arrEmloyees[0] = new Employee("Petrov Vasya", 15000, 41);
        arrEmloyees[1] = new Employee("Sidorov Petr", 25000, 30);
        arrEmloyees[2] = new Employee("Ivanova Vika", 30000, 46);
        arrEmloyees[3] = new Employee("Petrova Tanya", 18000, 36);
        arrEmloyees[4] = new Employee("Kukushlin Stas", 22000, 38);

        EmployeeOlderFourty(arrEmloyees);


    }


}
