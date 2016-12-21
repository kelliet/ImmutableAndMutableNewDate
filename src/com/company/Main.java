package com.company;

import com.person.ImmutablePerson;
import com.person.MutablePerson;

import java.time.LocalDate;
import java.time.Month;


public class Main {

    public static void main(String[] args) {
        //Here we are using the 'old' Calendar methods.
        LocalDate localDate = LocalDate.of(1995, Month.APRIL, 1);

        MutablePerson harry = createMutable("harry", "houdini", localDate);
        System.out.println(harry.getFirstName() + " DOB is " + harry.getDOB() + "\n");
        localDate = localDate.plusMonths(3);
        MutablePerson jill = createMutable("jill", "Barber", localDate);
        System.out.println(jill.getFirstName() + " DOB is " + jill.getDOB() + "\n");
        System.out.println(harry.getFirstName() + " DOB is " + harry.getDOB() + "\n");

        ImmutablePerson john = new ImmutablePerson("john", "smith", localDate);
        System.out.println(john.getFirstName() + " DOB is " + john.getDOB() + "\n");
        localDate = localDate.plusMonths(4);
        System.out.println(john.getFirstName() + " DOB is " + john.getDOB() + "\n");
        LocalDate newDate = john.getDOB();
        newDate = newDate.plusMonths(2);
        System.out.println(john.getFirstName() + " DOB is " + john.getDOB() + "\n");
    }

   public static MutablePerson createMutable(String firstName, String lastName, LocalDate date) {
        MutablePerson mutablePerson = new MutablePerson();
        mutablePerson.setFirstName(firstName);
        mutablePerson.setLastName(lastName);
        mutablePerson.setDOB(date);

        return mutablePerson;
    }

    public static ImmutablePerson createImmutable(String firstName, String lastName, LocalDate date) {
        ImmutablePerson immutablePerson = new ImmutablePerson(firstName, lastName, date);

        return immutablePerson;
    }
}
