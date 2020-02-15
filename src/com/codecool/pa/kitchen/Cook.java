package com.codecool.pa.kitchen;

import java.util.Calendar;

public class Cook extends Producer{
    public Cook(String name, Calendar birthDate, Double salary) {
        super(name, birthDate, salary);
    }

    @Override
    void cook() {
        System.out.println("Cooking");
        daySinceEmployed++;
        if (daySinceEmployed == 4) {
            hasKnifeSett = true;
        }
    }
}
