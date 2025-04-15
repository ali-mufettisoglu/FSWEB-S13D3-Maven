package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    String city;
    String birthDate;

    public Person(String firstName,String lastName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String gender, String city, String birthDate) {
        this(firstName,lastName,age);
        this.gender = gender;
        this.city = city;
        this.birthDate = birthDate;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        return age > 12 && age < 20 ;
    }
}
