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
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter value of N: ");
        int length = sc.nextInt();
        int [] studentScore = new int[length];
        double sum = 0;
        for(int i = 0;i < studentScore.length;i++){
            studentScore[i] = rand.nextInt(101);
            System.out.print(studentScore[i]+ " ");
            sum += studentScore[i];
            
        }
        double average = sum / length;
        int highest = studentScore[0];
        int lowest = studentScore[0];
        
        for(int i = 1;i < studentScore.length;i++){
            if(studentScore[i] > highest){
                highest = studentScore[i];
            }
            if(studentScore[i] < lowest){
                lowest = studentScore[i];
            }
        }
        System.out.println();
        System.out.println("Average: "+ average);
        System.out.println("Highest score: "+highest);
        System.out.println("Lowest score: "+lowest);
    }
    
}
