/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_4;

/**
 *
 * @author Asus
 */

import java.util.Scanner;

public class NO_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year (0-6): ");
        int firstDay = input.nextInt();

        int day = firstDay;

        for (int month = 1; month <= 8; month++) {

            int days = 0;
            String monthName = "";

            if (month == 1) {
                days = 31;
            } else if (month == 2) {
                if ((year % 400 == 0) ||
                    (year % 4 == 0 && year % 100 != 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
            } else if (month == 3 || month == 5 || month == 7) {
                days = 31;
            } else if (month == 4 || month == 6 || month == 8) {
                days = 30;
            }

            if (month == 5) {
                monthName = "May";
            } else if (month == 8) {
                monthName = "August";
            }

            if (month == 5 || month == 8) {
                System.out.println("\n       " + monthName + " " + year);
                System.out.println("---------------------------");
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");

                for (int i = 0; i < day; i++) {
                    System.out.print("    ");
                }

                for (int date = 1; date <= days; date++) {
                    System.out.printf("%3d ", date);

                    if ((day + date) % 7 == 0) {
                        System.out.println();
                    }
                }

                System.out.println();
            }

            day = (day + days) % 7;
        }

    
    }
}
