/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author User
 */
public class Question4 {
    public static void main(String[] args) {
        int [][] matrix = {{1, 5, 7}, {3, 6, 9}, {5, 3, 8}};
        int i;
        int j;
        System.out.println("3 by 3 Matrix");
        for(i = 0;i < matrix.length;i++){
            for(j = 0;j <matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        int [][] rotateMatrix = new int [3][3];
        for(i = 0; i < rotateMatrix.length;i++){
            for(j = 0;j <rotateMatrix.length;j++){
                rotateMatrix[j][3-i-1] = matrix[i][j];
            }
                
        }
        System.out.println("After rotates 90 degrees clockwise");
        
         for(i = 0;i < rotateMatrix.length;i++){
            for(j = 0;j <rotateMatrix[i].length;j++){
                System.out.print(rotateMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}
