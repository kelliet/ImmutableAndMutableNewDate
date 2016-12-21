package com.person;

import java.time.LocalDate;

/**
 * Created by kellie on 12/21/16.
 */
public class MutablePerson {

    private String firstName;
    private String lastName;
    private LocalDate DOB;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }





}
