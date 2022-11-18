package org.example;

public class EmployeeWageBuilder1 {
    //CONSTANTS
    public static final int IS_FULL_TIME_PRESENT = 1;
    public static final int IS_PART_TIME_PRESENT = 2;
    public static final int FULL_DAY_HOURS = 8;
    public static final int PART_TIME_HOURS = 4;
    public static final int WAGE_PER_HOUR = 20;
    public static final int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        int totalWage = 0;
        while (totalWorkingHours <= MAX_WORKING_HOURS && totalWorkingDays < MAX_WORKING_DAYS) {
            int attendance = (int) Math.floor(Math.random() * 3);
            switch (attendance) {
                case IS_FULL_TIME_PRESENT:
                    System.out.println("Daily wage = " + FULL_DAY_HOURS * WAGE_PER_HOUR);
                    totalWorkingHours = totalWorkingHours + FULL_DAY_HOURS;
                    break;
                case IS_PART_TIME_PRESENT:
                    System.out.println("Daily wage = " + PART_TIME_HOURS * WAGE_PER_HOUR);
                    totalWorkingHours = totalWorkingHours + PART_TIME_HOURS;
                    break;
                default:
                    System.out.println("Employee Absent");
                    break;
            }
            totalWorkingDays++;
        }
        System.out.println("Total working days : " + totalWorkingDays);
        System.out.println("Total working hours : " + totalWorkingHours);
        totalWage = totalWorkingHours * WAGE_PER_HOUR;
        System.out.println("Total wage  = " + totalWage);
    }
}