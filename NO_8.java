/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_4;

/**
 *
 * @author Asus
 */


import java.util.Random;

public class NO_8 {
    public static void main(String[] args) {

        Random random = new Random();

        // Generate random number between 0 and 100
        int n = random.nextInt(101);

        System.out.println("Random n: " + n);
        System.out.println("First " + n + " prime numbers:");

        int count = 0;
        int number = 2;

        // Generate prime numbers
        while (count < n) {

            boolean isPrime = true;

            // Check whether number is prime
            for (int i = 2; i <= number / 2; i++) {

                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Display prime number
            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }

            number++;
        }

        System.out.println();
    }
}
