/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();
        System.out.print("Enter value for b: ");
        int b = sc.nextInt();
        System.out.print("Enter value for c: ");
        int c = sc.nextInt();
        System.out.print("Enter value for d: ");
        int d = sc.nextInt();
        System.out.print("Enter value for e: ");
        int e = sc.nextInt();
        System.out.print("Enter value for f: ");
        int f = sc.nextInt();
        
        if(a*d - b*c != 0){
            int x = (e*d - b*f) / (a*d - b*c);
            int y = (a*f - e*c) / (a*d - b*c);
            System.out.println("x = "+x);
            System.out.println("y = "+y);
        }else
            System.out.println("The equation has no solution");
    }
    
}
