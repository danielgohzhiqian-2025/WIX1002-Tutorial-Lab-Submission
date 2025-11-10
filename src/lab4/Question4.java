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
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.println("Enter the first day of the year(0 for Saturday, 1 for Monday...etc): ");
        int firstDayOfYear = sc.nextInt();
        
        int totalDaysBeforeMay = 31 + (isLeapYear(year) ? 29 : 28) + 31 + 30;
        int totalDaysBeforeAugust = totalDaysBeforeMay + 31 + 30 + 31;
        
        int firstDayOfMay = (firstDayOfYear + totalDaysBeforeMay) % 7;
        int firstDayOfAugust = (firstDayOfYear + totalDaysBeforeAugust) % 7;
        
        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        for(int i = 0;i < firstDayOfMay;i++){
            System.out.printf("%4s", "");
        }
        
        for (int i = 1; i <= 31; i++) {
            System.out.printf("%4s", i);
            if ((i + firstDayOfMay) % 7 == 0) 
                System.out.println();
        }
        
            System.out.println();

        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        for(int i = 0; i < firstDayOfAugust; i++) {
            System.out.printf("%4s", "");
        }
        for (int i = 1; i <= 31; i++) {
            System.out.printf("%4s", i);
            if ((i + firstDayOfAugust) % 7 == 0) 
                System.out.println();
        }
        System.out.println();
        
        
        
        
        
    }
      public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    
}
