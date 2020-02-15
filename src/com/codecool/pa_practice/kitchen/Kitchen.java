package com.codecool.pa_practice.kitchen;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

class Kitchen {

    private Chef chef;
    private Random random = new Random();
    private ArrayList<Cook> cooks = new ArrayList<>();
    private ArrayList<Helper> helpers = new ArrayList<>();

    public Kitchen(Chef chef) {
        this.chef = chef;
    }

    public void addHelper(String name, Calendar birthDate, Double salary) {
        helpers.add(new Helper(name, birthDate, salary));
    }

    public void addCook(String name, Calendar birthDate, Double salary) {
        cooks.add(new Cook(name, birthDate, salary));
    }

    public Employee getEmployeeByName(String name) {
        if (chef.getName().equals(name)) { return chef;}
        for (Cook cook : cooks) {
            if (cook.getName().equals(name)) { return cook; }
        }
        for (Helper helper :
                helpers) {
            if (helper.getName().equals(name)) { return helper; }
        }
        return null;

    }

    public void cookOneDay() {
        chef.cook();
        if (chef.yell()) {
            boolean itemFound = false;
            int itemNumber = random.nextInt(3);
            for (Helper helper: helpers) {
                if (helper.getItem(itemNumber)) {
                    itemFound = true;
                    break;
                }
            }
            if (!itemFound) {
                for (Helper helper : helpers) {
                    helper.allOut();
                }
            }
        }
        for (Cook cook : cooks) {
            cook.cook();
        }
    }
}
