package homework.final_test;

import java.util.Objects;

public class Person {
    /*
     * Создать класс Person.
     * У класса должны быть поля:
     * 1. Имя (String)
     * 2. Фамилия (String)
     * 3. Возраст (продумать тип)
     * 4. Пол
     * 5*. Придумать свои собственные поля
     * 
     * Для этого класса
     * 1. Реализовать методы toString, equals и hashCode.
     * 2*. Придумать собственные методы и реализовать их
     * 
     * В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и
     * вывести их на экран.
     */

    String name;
    String surname;
    int age;
    String gender;
    int salary;
    String profession;

    public Person(String name, String surname, int age,
            String gender, int salary, String profession) {

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return String.format("Name: %s Surname: %s  Age: %d years Gender: %s Salary: %d USD Profession: %s",
                name, surname, age, gender, salary, profession);
    }

    @Override
    public boolean equals(Object arg) {
        if (arg == null)
            return false;
        if (!(arg instanceof Person))
            return false;
        Person anotherPerson = (Person) arg;
        return name.equals(anotherPerson.name)
                && surname.equals(anotherPerson.surname)
                && Integer.toString(age).equals(Integer.toString(anotherPerson.age))
                && gender.equals(anotherPerson.gender)
                && Integer.toString(salary).equals(Integer.toString(anotherPerson.salary))
                && profession.equals(anotherPerson.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, gender, salary, profession);
    }
}