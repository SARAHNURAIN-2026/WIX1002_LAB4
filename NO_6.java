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


public class NO_6 {
    public static void main(String[] args) {
        Random random = new Random ();
        
        int number = random.nextInt(Integer.MAX_VALUE);
        int temp = number;
        int count = 0;
        
        System.out.println("Random number:" + number);
        
        if (temp == 0) {
            count = 1;
                   
    }   else{
            while (temp > 0) {
                temp = temp/10;
                count++;
            }
        }
        System.out.println("Number of digits :" + count);
    }
   
}
