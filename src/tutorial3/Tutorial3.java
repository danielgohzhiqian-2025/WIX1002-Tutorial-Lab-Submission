/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial3;

import java.util.Scanner;



/**
 *
 * @author User
 */
public class Tutorial3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = sc.next();
        System.out.print("Enter another string: ");
        String s2 = sc.next();
        int compare = (s1).compareTo(s2);
        if (compare <= 0){
            System.out.println(s1);
            System.out.println(s2);
        }else{
            System.out.println(s2);
            System.out.println(s1);
        }
        
    }
    
        //Question 1
        //a
        /*if(3 * 8 == 27){
            System.out.println(true);
        }else
            System.out.println(false);*/
        
        //b
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("Even number");
        }else
            System.out.println("Odd number");*/
        
        //c
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = sc.next().charAt(0);
        if(Character.isUpperCase(input)){
            System.out.println("Capital Letter");
        }else
            System.out.println("Not a Capital Letter");*/
        
        //d
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = sc.next();
        System.out.print("Enter another string: ");
        String s2 = sc.next();
        int compare = (s1.toLowerCase()).compareTo(s2.toLowerCase());
        if (compare <= 0){
            System.out.println(s1);
            System.out.println(s2);
        }else{
            System.out.println(s2);
            System.out.println(s1);
        }*/
        
        //e
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer between 0-6: ");
        int number = sc.nextInt();
        switch(number){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Thos programme only accept number range of 0-6");}*/
        
        //Question 2
        //a
        /*if (num1 == num2){
            System.out.println("Number 1 is equal to number 2.");
        }*/
        
        //b
        /*if (x>y && x>z)
            System.out.println("x is the largest number");*/
        
        //c
        /*String s1, s2;
        if(s1.equals(s2))
            System.out.println("They are equals string.");
        else
            System.out.println("They are not equals string.");*/
        
        //d
        /*if(x>0 || y>0 ){
            System.out.println("Either x or y is positive");
        }*/
        
        //Quesiton 3
        //a
        /*#####
          $$$$$
        */
        
        //b
        /*#####
          $$$$$
        */
        
        //c
        // #####
        
        //d
        //
        
        //Question 4
        /*int a = 1;
        int b = 2;
        int c = 3;
        if( a > b && a > c ){
            System.out.println("The biggest integer is "+a);
        }
        else if(b > a && b > c){
            System.out.println("The biggest integer is "+b);
        }else
            System.out.println("The biggest integer is "+c);*/
        
        //Question 5
        /*int year = 2032;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year+" is a Leap year");
        }else
            System.out.println(year+" is not a Leap year");*/
            
        
        
         
    
    
}
