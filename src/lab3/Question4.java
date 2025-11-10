/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.util.Random;

/**
 *
 * @author User
 */
public class Question4 {
    public static void main(String[] args) {
        Random random = new Random();
        int player1 = 0;
        int player2 = 0;
        
        for(int i = 0; i < 2;i++){
            int dice1 =  random.nextInt(6)+1;
            int dice2 =  random.nextInt(6)+1;
            player1 = player1 + dice1;
            player2 = player2 + dice2;
            System.out.println("Player 1: "+ dice1);
            System.out.println("Player 2: "+ dice2);
        }
        
        
        
        if(player1>player2){
            System.out.println("Player 1 Win!");
        }else if(player2 > player1){
            System.out.println("Player 2 Win!");
        }else
            System.out.println("Draw");
    }
}
