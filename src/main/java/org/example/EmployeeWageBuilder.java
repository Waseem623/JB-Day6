package org.example;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //CONSTANTS
        int IS_FULL_TIME_PRESENT = 1;
        int FULL_DAY_HOURS = 8;
        int WAGE_PER_HOUR = 20;

        int workingHours = 0;
        double attendance = Math.floor(Math.random() * 10) % 2;
        if (attendance == IS_FULL_TIME_PRESENT) {
            System.out.println("Employee is present");
            workingHours = workingHours + FULL_DAY_HOURS;
        } else {
            System.out.println("Employee is absent");
            workingHours = workingHours + 0;
        }
        int dailyWage = workingHours * WAGE_PER_HOUR;
        System.out.println("Today's Wage = " + dailyWage);
    }
}