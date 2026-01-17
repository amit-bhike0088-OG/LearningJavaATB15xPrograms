package EXAM11thJan2026.JavaCodingTest;
//8) Month Name Finder
//Description:
//Write a Java program to print the month name based on the month number (1–12) using a switch statement.

import java.util.Scanner;

public class MonthFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int monthNumber = scanner.nextInt();
        String monthName;

        switch (monthNumber) {
            case 1:  monthName = "January";   break;
            case 2:  monthName = "February";  break;
            case 3:  monthName = "March";     break;
            case 4:  monthName = "April";     break;
            case 5:  monthName = "May";       break;
            case 6:  monthName = "June";      break;
            case 7:  monthName = "July";      break;
            case 8:  monthName = "August";    break;
            case 9:  monthName = "September"; break;
            case 10: monthName = "October";   break;
            case 11: monthName = "November";  break;
            case 12: monthName = "December";  break;
            default: monthName = "Invalid Month Number!"; break;
        }

        System.out.println("Month: " + monthName);

        scanner.close();
    }
}
