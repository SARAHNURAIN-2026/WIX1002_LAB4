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


public class NO_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an Integer : ");
        int num = input.nextInt();
        
        System.out.println("The factors are :");
        
        for(int i = 1; i<= num; i ++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        
    }
    
}
