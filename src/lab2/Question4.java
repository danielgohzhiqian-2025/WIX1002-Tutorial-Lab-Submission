/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds:");
        int initialSecond = sc.nextInt();
        int hours = initialSecond / 3600;
        int mins = (initialSecond-hours * 3600)/60;
        int seconds = initialSecond-hours*3600-mins*60;
        System.out.println(initialSecond + " seconds is "+ hours + " hours, "+ mins +
                " minutes, " + seconds + " seconds" );
    }
    
 
    
    
}


