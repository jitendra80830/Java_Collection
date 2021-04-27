
package com.mycompany.javacollection;

import java.util.*;

public class StringClass {
    public static void main(String[] args){
        
        String name = new String("Rahul");
        
        System.out.println(name);
        
        //Find the length
        System.out.println(name.length());
        
        String name1 = "Rahul";
        
        //Use of equals
        if(name.equals(name)){
            System.out.println("Same");
        }else{
            System.out.println("Defferents");
        }
        
        //How to concat
        System.out.println(name.concat(name1));
    }
    
}
