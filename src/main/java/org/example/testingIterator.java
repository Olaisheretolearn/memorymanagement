package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class testingIterator  {


    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();
        alist.add("one");
        alist.add("two");
        alist.add("three");
        alist.add("four");
        alist.add("five");
        alist.add("six");
        alist.add("seven");
        alist.add("eight");

        Iterator<String> iter = alist.iterator();

        System.out.println("with iterator");
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("\n \n");
        System.out.println("with loops");
        for(String haha : alist){
            System.out.println(haha);
        }






    }


}
