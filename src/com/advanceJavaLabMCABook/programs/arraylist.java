package com.advanceJavaLabMCABook.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class arraylist
{
    public static void main(String[] args)
    {
    ArrayList<String> al = new ArrayList<String>();
    al.add("Rishabh");
    al.add("Avinash");
    al.add("Shreyas");
    al.add("Alex");

        ArrayList al2 = new ArrayList();
        al2.addAll(al);
        Iterator iteratorObj = al2.iterator();
        while(iteratorObj.hasNext())
        {
            System.out.println(iteratorObj.next());
        }
        System.out.println("-----------------");
        System.out.println(al.size());
        System.out.println(al.get(3));



    }
}
