/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int n = sc.nextInt();
        int [][] pascal = new int[n][n];
        
        for(int i = 0;i < n;i++){
            pascal[i][0] =1;
            for(int j = 1;j <= i;j++){
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
            
        }
        System.out.println("The Pascal Triangle with " + n + " row(s)");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
        
        
        
    }
    
}
