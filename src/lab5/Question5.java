/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Question5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] numbers =new int[20];
        
        //generate random number
        System.out.println("A list of 20 random integer within 0 to 100");
        for(int i = 0;i < numbers.length;i++){
            numbers[i] = rand.nextInt(101);
            System.out.print(numbers[i] + " ");  
        }
        System.out.println();
        
        //sort it in decending order
        for(int pass = 1;pass< numbers.length;pass++){
            for(int i = 0;i < numbers.length -1;i++){
                if(numbers[i] < numbers[i+1]){
                    int hold = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = hold;
                }
            }
        }
        System.out.println("Array in descending order:");
        for(int i = 0;i < numbers.length;i++){
            
            System.out.print(numbers[i] + " ");  
        }
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int targetNumber = sc.nextInt();
        
        //linear search
        for(int i = 0;i < numbers.length;i++){
            if(numbers[i] == targetNumber){
                System.out.println(targetNumber + " found");
                System.out.println("Linear search - "+(i + 1)+" loop(s)");
                
            }
        }
        
        //binary search
        int low = 0;
        int high = numbers.length-1;
        int middle;
        int counter = 1;
        while (low <= high){
            middle = (high+low)/2;
            if(numbers[middle] == targetNumber){
                System.out.println(targetNumber + " found");
                System.out.println("Binary search - "+counter+" loop(s)");
                break;
            }else if(numbers[middle] < targetNumber){
                high = middle -1;
            }else{
                low = middle +1;
            
            }
            counter++;
        }
        
        
        
        
    }
    
}
