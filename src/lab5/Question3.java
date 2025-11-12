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
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Enter the number of workers: ");
        int N = sc.nextInt();
        int [][] workingHour = new int[N][7];
        
        
        for(int i = 0;i < workingHour.length;i++){
            int sum = 0;
            System.out.print("Worker "+(i+1)+": ");
            for(int j = 0;j < workingHour[i].length;j++){
                workingHour[i][j] = rand.nextInt(8) + 1;
                sum += workingHour[i][j]; 
                System.out.print(workingHour[i][j]+ " ");
                
            }
            System.out.println();
            System.out.print("Total working hour for Worker "+(i+1)+": "+sum);
            System.out.println();
        }
        
        
        
        
    }
}
