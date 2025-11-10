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
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.print("Enter the coordinate x: ");
        int x = sc.nextInt();
        System.out.print("Enter the coordinaate y: ");
        int y = sc.nextInt();
        System.out.println("Enter the center of the circle for x: ");
        int centerX = sc.nextInt();
        System.out.println("Enter the center of the circle for y: ");
        int centerY = sc.nextInt();
        
        double distance = Math.sqrt(Math.pow(x - centerX ,2)+Math.pow(y -centerY, 2));
        if(distance <= radius){
            System.out.println("Coordinate {"+ x +", "+ y +"} is inside the circle");
        }else
            System.out.println("Coordinate {"+ x +", "+ y +"} is outside the circle");
        
        
        
            
        
    }
    
}
