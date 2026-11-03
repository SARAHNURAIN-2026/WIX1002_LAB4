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


public class NO_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int count = 0;
        double sum = 0;
        double minimum = 0;
        double maximum = 0;
        double sumSquares = 0;
        
        System.out.println("Enter score (negative to quit) : ");
        double score = input.nextDouble();
        
        while(score >= 0) {
            count++;
            sum += score;
            sumSquares += score * score;
            
            if(count == 1) {
                minimum = score;
                maximum = score;
            } else {
                if(score < minimum) {
                    minimum = score;
                } 
                if(score > maximum) {
                    maximum = score;
                }
            }
            System.out.println("Enter score (negative to quit) : ");
            score = input.nextDouble();
        }
        
        if (count == 0) {
            System.out.println("No scores entered");
        } else {
            double average = sum/ count;
            double s = 0;
            if (count > 1){
                double variance = (sumSquares - sum*sum/count) / (count - 1);
                s = Math.sqrt(variance);
                
            }
            System.out.println("Minimum = " + minimum);
            System.out.println("Maximum = " + maximum);
            System.out.printf("Average = %.2f%n", average);
            System.out.printf("Standard deviation = %.2f%n", s);
        }
    } 
}
