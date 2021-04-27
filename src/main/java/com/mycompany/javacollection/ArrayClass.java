
package com.mycompany.javacollection;

import java.util.Arrays;


public class ArrayClass {
    public static void main(String[] args){
        
        //Arrays declaration
        
        String[] productName = {"vivo11","sumsung","nokia","mi","oppo"};
        
        int[] productPrice = {1001,8000,12000,11000,15000};
        
        //Print Arrays
        
        System.out.println(Arrays.toString(productName));
        System.out.println(Arrays.toString(productPrice));
        
        //How to access Items
        //System.out.println(productName[1]);
        
        /*How to Edit Items
        
        productName[0]="Intex";
        System.out.println(Arrays.toString(productName));*/
        
        
        //How to finding lenth of arrays
        //System.out.println(productName.length);
        
        /*Traversing Using For Loop
        for(int i = 0;i<productName.length;i++){
            System.out.println(productName[i]);
        }*/
        
        
        /*Using each loop
        for(String items : productName){
            System.out.println(items);
            
        }*/
        
        
        //2D Arrays
        int[][] matrix = {{1,2,3,4},{5,6,7,8}};
        
        //Print 2D arrays
        System.out.println(Arrays.deepToString(matrix));
        
        //Aceess Items From 2D Array
        System.out.println(matrix[0][2]);
        System.out.println(matrix[1][2]);
        
        //How to edit
        //matrix[0][2] = 200;
        //System.out.println(Arrays.deepToString(matrix));
        
        //Traversing
        for(int[] i : matrix){
            for(int n : i){
                System.out.println(n);
            }
        }
        
        
        
        
    }
    
}
