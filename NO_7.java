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


public class NO_7 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.println("Enter principal amount:");
        double P = input.nextDouble();
        
        System.out.println("Enter interest in % :");
        double i = input.nextDouble();
        
        System.out.println("Enter total number of month(s):");
        int N = input.nextInt();
        
        // monthly interest rate
        double r = i / (12*100);
        
        double M = (P*r) / (1 - Math.pow(1 + r, -N));
        
        double balance = P;
        double totalInterest = 0;
        
        System.out.println("\nMonth\tMonthly Payment\tPrincipal\tInterest\tUnpaid Balance\tTotal Interest");
        
        for (int n =1; n <= N; n++) {
            
            double interest = balance * r;
            
            double principal = M - interest;
            
            balance = balance - principal ;
            
            
            totalInterest = totalInterest + interest;
            
             System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f%n",
                    n, M, principal, interest, balance, totalInterest);
        }
                
        
            
      
    }
    
}
