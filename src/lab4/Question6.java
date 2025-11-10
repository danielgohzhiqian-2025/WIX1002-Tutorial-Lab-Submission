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
public class Question6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = Math.abs(rand.nextInt());
        System.out.println("Number: "+number);
        int digits = 0;
        if(number == 0){
            digits = 1;
        }else{
            while(number >0){
                number = number/10;
                digits++;
            }
        }
        
        System.out.println("Total digits are: "+digits);
        
    }
    
}
