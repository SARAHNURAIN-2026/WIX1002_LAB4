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


public class NO_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer n :");
        int n = input.nextInt();
        
        int total = 0;
        int termSum = 0;
        
        for(int i = 1; i <= n; i++) {
            termSum += i;
            total += termSum;
        }
        System.out.println("Sum of the series = " + total );
        }
    }


