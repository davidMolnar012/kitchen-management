package com.codecool.pa.kitchen;

import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Random;

class Helper extends Employee {
    private int[] ingredients = new int[3];

     Helper(String name, Calendar birthDate, Double salary) {
        super(name, birthDate, salary);

    }

    void allOut() {
         System.out.println("We’re all out");
    }

    boolean getItem(int item) {
        if (ingredients[item] > 0) {
            ingredients[item]--;
            return true;
        }
        return false;
    }

}
