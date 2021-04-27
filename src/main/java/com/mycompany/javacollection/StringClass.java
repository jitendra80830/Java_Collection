
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
        //System.out.println(name.concat(name1));
        
        /*Uses of Contains method
        System.out.println(name.contains("R"));
        System.out.println(name.contains("m"));*/
        
        /*upercase and lowercase
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());*/
        
        
        /*IndexOf
        System.out.println(name.indexOf("l"));*/
        
        
        /*How to know lastIndex of a particular Strings
        System.out.println(name.lastIndexOf("a"));*/
        
        
        /*replace/replaceAll
        System.out.println(name.replace("R","J"));
        
        String str = "I am jitendra Kumar From Gaya";
        
        System.out.println(Arrays.toString(str.split(" ")));
        System.out.println(str.indexOf("Gaya"));
        System.out.println(str.length());*/
        
        
        //toCharArray
        String str = "I am jitendra Kumar From Gaya";
       
        System.out.println(Arrays.toString(str.toCharArray()));
        
        //SubString
        System.out.println(str.substring(3));
        System.out.println(str.substring(4,29));
        
    
        
        
    }
    
}

