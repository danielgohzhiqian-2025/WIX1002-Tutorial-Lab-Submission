/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.Random;

/**
 *
 * @author User
 */
public class Question2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] number = new int[10];
        int i = 0;
        
        while (i < number.length){
            boolean duplicate = false;
            int randNum = rand.nextInt(21);
            for(int j = 0;j <= i;j++){
                if(randNum == number[j]){
                    duplicate = true;
                }
            }
            
            if(duplicate == false){
                number[i] = randNum;
                i++;
            }
                
            
        }
        
        for(int n = 0;n < number.length;n++){
            System.out.print(number[n] + " ");
        }
        
        System.out.println();
        
    }
    
}
