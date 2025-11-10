/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a score[negative score to quit]: ");
        int score = sc.nextInt();
        int maxScore = score;
        int minScore = score;
        int sum = 0;
        int counter=0;
        int sumSquare = 0;
        while (score >= 0){
            sum += score;
            sumSquare += Math.pow(score, 2);
            if(score > maxScore){
                maxScore = score;
            }
            if(score < minScore){
                minScore = score;
            }
            System.out.print("Enter a score[negative score to quit]: ");
            score = sc.nextInt();
            
            counter++;
        }
        
        double average = (double)sum/counter;
        double sd = Math.sqrt((sumSquare-(Math.pow(sum, 2) / counter))/(counter-1));
        System.out.println("Minimum score: "+minScore);
        System.out.println("Maximum score: "+maxScore);
        System.out.printf("Average Score: %.2f \n", average);
        System.out.printf("Standard deviation: %.2f \n", sd);
        
    }
    
}
