package com.codecool.pa_practice.kitchen;

import java.util.Calendar;

abstract class Employee {

    private String name;
    private Calendar birthDate;
    private Double salary;

    Employee(String name, Calendar birthDate, Double salary) {
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
    }
    public void taxReport() {
        System.out.println(name + "'s tax is " + (salary - salary / 100));
    }

    public String getName() {
        return name;
    }
}


