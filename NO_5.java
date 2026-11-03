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


public class NO_5 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int player1 = 0;
        int player2 = 0;
        int currentPlayer = 1;
        int dice;
        
        while( player1 < 100 && player2 < 100) {
            if (currentPlayer == 1 ) {
                System.out.println("Player 1's turn");
                
                do{
                    dice = random.nextInt(6) + 1;
                    System.out.println("Dice rolled:" + dice);
                    
                    player1 = player1 + dice;
                    System.out.println("Player 1 score: " + player1);
                    
                    if (dice != 6) {
                        currentPlayer = 2;
                    }
                } while (dice == 6 && player1 <= 100);
                
            } else {
                System.out.println("Player 2's turn");

                do{
                    dice = random.nextInt(6) + 1;
                    System.out.println("Dice rolled: " + dice);
                    
                    player2 += dice;
                    System.out.println("Player 2 score :  " + player2);
                    
                    if(dice != 6) {
                        currentPlayer = 1;
                    }
                } while (dice == 6 && player2 <= 100);
                    
            }
        if (player1 >= 100) {
            System.out.println("Player 1 wins");
            
        } else if (player2 >= 100) {
            System.out.println("Player 2 wins");
        }
        
            }
        }
    }

            
        
        
    
