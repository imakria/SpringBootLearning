package com.imakria.demoReactSpringBoot.student;

import java.util.UUID;

public class Student {

    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Gender gender;

    public enum Gender {
        MALE, FEMALE
    }

    public Student(UUID id,
                   String firstName,
                   String lastName,
                   String email,
                   Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
