package com.hyrtutorials.colectionsPractice;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerate {
    public static void main(String[] args){
        Vector<String> v=new Vector<>();
        v.add("Banana");
        v.add("Mango");
        v.add("Orange");
        Enumeration<String> e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
