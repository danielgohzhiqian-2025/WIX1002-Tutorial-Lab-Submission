/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.Random;

/**
 *
 * @author User
 */
public class Question5 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int player1 = 0;
        int player2 = 0;
        while (player1 < 100 && player2 < 100){
            //player 1 turn
            int dice = rand.nextInt(6)+ 1;
            System.out.println("Player 1 rolls: "+dice);
            player1 += dice;
            while (dice == 6){
                dice = rand.nextInt(6) + 1;
                System.out.println("Player 1 roll again: "+dice);
            }
            if(player1 >= 100) break;
            
            //player 2 turn
            dice = rand.nextInt(6)+ 1;
            System.out.println("Player 2 rolls: "+dice);
            player2 += dice;
            while (dice == 6){
                dice = rand.nextInt(6) + 1;
                System.out.println("Player 2 roll again: "+dice);
            }
            if(player2 >= 100) break; 
        }
        System.out.println("Player 1 score: "+player1);
        System.out.println("Player 2 score: "+player2);
        
        if(player1 > player2){
            System.out.println("Player 1 win!!");
        }else
            System.out.println("Player 2 win!!");
    }
    
}
