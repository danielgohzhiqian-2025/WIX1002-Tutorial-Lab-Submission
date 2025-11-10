/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial4;

import java.util.Random;

/**
 *
 * @author User
 */
public class Tutorial4 {
    public static void main(String[] args) {
        //Question 1
        //a
        /*int n = 1;
        
        while (Math.pow(n, 3)< 2000){
            n++;  
        }
        System.out.println(n-1);*/
        
        //b
        /*for(int i = 1;i <= 12;i++){
            System.out.println((int)Math.pow(i, 2));
        }*/
        
        //c
        /*Random random = new Random();
        for(int i = 1;i <= 4;i++){
            for(int j = 1; j <= 5;j++){
                System.out.print(random.nextInt(100) + " ");
            }
            System.out.println("\n");
        }*/
        
        //d
        /*int sum = 0;
        int num = 2000;
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println(sum);*/
        
        //e
        /*double sum = 0;
        for(int i = 1; i <= 25; i++){
            double divider = (double)i/(26-i);
            sum += divider;
         
        }
        System.out.printf("%.2f", sum);*/
        
        //Question 2
        //a
        /*for(int x=10; x< 0;x--)
            sum += x;*/
        
        //b
        /*
        do
          x += 2;
          y += x;
          System.out.println(x + "and" + y);
        while(x < 100);
        */
        
        //c
        /*for(x==1, y==20;x<y;x++,y-=2){
            System.out.println(x + " "+ y);
         }*/
        
        //d
        /*
        int i = 1;
        while(i <= 10){
            if (i == 10){
                System.out.println("Program End");
        }
        }
        */
        
        //Question 3
        /*int f1 = 1;
        int f2 = 1;
        System.out.print(f1 + " ");
        System.out.print(f2 + " ");
        for(int i = 0;i < 8;i++){
            int f3 = f1 + f2; 
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
        }*/
        
        //Question 4
        /*String s1 = "Hello";
        String reversedString = "";
        for(int i = s1.length() -1;i >= 0;i--){
            char character = s1.charAt(i);
            reversedString = reversedString.concat(Character.toString(character));
            
        }
        System.out.println(reversedString);*/
        
        
        
    }
    
}
