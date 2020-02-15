package com.codecool.pa_practice.kitchen;

import java.util.Calendar;

abstract class Producer extends Employee{
    int daySinceEmployed;
    boolean hasKnifeSett;

    public Producer(String name, Calendar birthDate, Double salary) {
        super(name, birthDate, salary);
        hasKnifeSett = false;
        daySinceEmployed = 0;

    }

    void cook() {
        System.out.println("Not cooking");
        daySinceEmployed++;
        if (daySinceEmployed == 4) {
            hasKnifeSett = true;
        }
    }

    boolean hasKnifeSett() {
        return hasKnifeSett;
    }
}
