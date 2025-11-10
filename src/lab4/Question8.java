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
public class Question8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int counter = rand.nextInt(100);
        int primeCounter = 0;
        int number = 2;
        System.out.println("First "+ counter +" prime numbers");
        while(primeCounter != counter){
            if(isPrime(number)){
                primeCounter++;
                System.out.print(number+" ");   
            }
            number++;
        }
        
       
    }
    
    public static boolean isPrime(int n){
        // Check from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }
    
}
