package ru.geekbrains.java_one.lesson_d.home;

public class Main {
    private static void EmployeeOlderFourty(Employee[] arr){    //вызывает метод печати информации о сотрудниках старше 40
        for (int i = 0; i < arr.length; i++) {
            arr[i].OlderFourty();
        }
    }
    private static void EmployeeFourtyFiveSalaryUp(Employee[] arr){   //повышает зп на 5000 сотрудникам старше 45

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() > 45){
                arr[i].setSalary(arr[i].getSalary() + 5000);
            }
        }
    }
    private static float avgSalaryAge(Employee[] arr, String avgWhat){
        float AVG = 0;

        for (int i = 0; i < arr.length; i++) {
            switch (avgWhat) {
                case "Salary":
                    AVG += arr[i].getSalary() / arr.length;
                    break;
                case "Age":
                    AVG += arr[i].getAge() / arr.length;
                    break;
            }
        }
        return AVG;
    }


    public static void main(String[] args){
        Employee Ivanov = new Employee("Ivanov Ivan", 10000, 32);
        System.out.printf("Id: %s, FIO: %s, age: %.0f\n",
                Ivanov.getId(), Ivanov.getFullName(), Ivanov.getAge());
        System.out.println();

        Employee[] arrEmloyees = new Employee[5];
        arrEmloyees[0] = new Employee("Petrov Vasya", 15000, 41);
        arrEmloyees[1] = new Employee("Sidorov Petr", 25000, 30);
        arrEmloyees[2] = new Employee("Ivanova Vika", 30000, 46);
        arrEmloyees[3] = new Employee("Petrova Tanya", 18000, 36);
        arrEmloyees[4] = new Employee("Kukushlin Stas", 22000, 38);

        EmployeeOlderFourty(arrEmloyees);
        System.out.println();

        EmployeeFourtyFiveSalaryUp(arrEmloyees);
        for (int i = 0; i < arrEmloyees.length; i++) {
            if (arrEmloyees[i].getAge() > 45){
                System.out.printf("Id: %s, FIO: %s, ZP: %.02f, age: %.0f\n",
                        arrEmloyees[i].getId(), arrEmloyees[i].getFullName(), arrEmloyees[i].getSalary(), arrEmloyees[i].getAge());
            }
        }
        System.out.println();

        System.out.printf("avgSalary: %.02f\n", avgSalaryAge(arrEmloyees, "Salary"));
        System.out.printf("avgAge: %.02f\n", avgSalaryAge(arrEmloyees, "Age"));

    }


}
