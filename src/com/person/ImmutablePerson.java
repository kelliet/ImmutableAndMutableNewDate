package com.person;

import java.time.LocalDate;


public class ImmutablePerson {

    private final String firstName;
    private final String lastName;
    private final LocalDate DOB;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDOB() {
        return DOB;
       // return new Date(DOB.getTime());
    }


    public ImmutablePerson(String firstName, String lastName, LocalDate DOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
    }

}
