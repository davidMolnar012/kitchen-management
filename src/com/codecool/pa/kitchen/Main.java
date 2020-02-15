package com.codecool.pa.kitchen;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Kitchen kitchen = new Kitchen(Chef.getInstance("Jane", Calendar.getInstance(), 200d));
        kitchen.addCook("James", Calendar.getInstance(), 20d);
        kitchen.addHelper("John", Calendar.getInstance(), 10d);
        kitchen.addCook("Kate", Calendar.getInstance(), 20d);
        kitchen.addHelper("Brain", Calendar.getInstance(), 10d);
        kitchen.addHelper("Lucy", Calendar.getInstance(), 10d);
        kitchen.addHelper("Kevin", Calendar.getInstance(), 10d);

        for (int i = 0; i < 10; i++) {
            kitchen.cookOneDay();
        }

        kitchen.getEmployeeByName("Lucy").taxReport();
    }
}
