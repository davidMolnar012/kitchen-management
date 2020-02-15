package com.codecool.pa_practice.kitchen;

import java.util.Calendar;
import java.util.Random;

public class Chef extends Producer{
    private static Chef instance;
    private Random random = new Random();

    public Chef(String name, Calendar birthDate, Double salary) {
        super(name, birthDate, salary);
    }

    boolean yell() {
        System.out.println("Constant yelling");
        return random.nextBoolean();
    }

    public static Chef getInstance(String name, Calendar birthDate, Double salary) {
        if (instance == null) {
            instance = new Chef(name, birthDate, salary);
        }
        return instance;
    }
}
