package homework.final_test;

import java.util.ArrayList;

public class final_task {
    public static void main(String[] args) {

        Person employee_1 = new Person("Maksim", "Ivanov", 33, "male  ", 95000, "Engineer");
        Person employee_2 = new Person("Sergey", "Petrov", 28, "male  ", 90000, "Manager");
        Person employee_3 = new Person("Alexey", "Sidorov", 19, "male  ", 50000, "Driver");
        Person employee_4 = new Person("Polina", "Kravec", 22, "female", 75000, "Accountant");
        Person employee_5 = new Person("Victor", "Petrov", 25, "male  ", 90000, "Manager");

        ArrayList<Person> staff = new ArrayList<>();

        staff.add(employee_1);
        staff.add(employee_2);
        staff.add(employee_3);
        staff.add(employee_4);
        staff.add(employee_5);

        for (Person employee : staff) {
            if (employee.age > 20) {
                System.out.println(employee);
            }
        }

        System.out.println(employee_2.surname.equals(employee_5.surname));
        System.out.println(employee_2.profession.hashCode());
        System.out.println(employee_5.profession.hashCode());
    }
}