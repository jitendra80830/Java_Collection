
package com.mycompany.javacollection;

import java.util.*;


public class Arraylist {
    public static void main(String[] args){
        
       /*//Any types item
        ArrayList list = new ArrayList();
        list.add("hello");
        list.add("World");
        list.add(12);
        list.add(16);
        
        System.out.println(list);*/
       
       //String types items
       /*ArrayList<String> list = new ArrayList<>();
       
       list.add("Hello");
       list.add("Jitendra");
       list.add("Ram");
       list.add("Lakshman");
       
       System.out.println(list);*/
       
       //Other way to declare arrays
       ArrayList<String> list = new ArrayList<>(Arrays.asList("Ram","rammu","Jitendra","Rahul"));
       
       list.add("jitendra");
       list.add("raj");
       
       //System.out.println(list);
       
       //Uses of addAll method
       
       ArrayList<Integer> mylist = new ArrayList<>();
       
       mylist.add(10);
       mylist.add(11);
       mylist.add(13);
       mylist.add(14);
       mylist.add(15);
       
       //mylist.addAll(list);
       
       //System.out.println(mylist);
       
       //How to access items
       //System.out.println(mylist.get(5));
       
       /*using fore loop
       for(int i = 0;i<mylist.size();i++){
           System.out.println(mylist.get(i));
       }*/
       
       /*using eachloop
       for(String item : list){
           System.out.println(item);  
       }*/
       
       /*Using Iterator
       Iterator<Integer> item = mylist.iterator();
       
       while(item.hasNext()){
           System.out.println(item.next());
       }*/
       
       
       /*How to edit items
       mylist.set(1,12);
       System.out.println(mylist);*/
       
       
       /*How to remove/delete items
       mylist.remove(1);
       System.out.println(mylist);*/
       
       /*How to sort
       
       Collections.sort(list);
       System.out.println(list);*/
       
       
       //How to reverse
       Collections.sort(mylist,Collections.reverseOrder());
       System.out.println(mylist);
       
       //usese of contains methods
       System.out.println(list.contains("raj"));
       
       //usese 0f isEmpty methods
       System.out.println(list.isEmpty());
       
       //check item on index
       
       System.out.println(list.indexOf("raj"));
  
    }
    
    
}
