package com.advanceJava_MCABook.programs;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEg
{
    public static void main(String[] args)
    {
        TreeMap<String,Integer> treeMapObj = new TreeMap<>();
        treeMapObj.put("s",8);
        treeMapObj.put("a",10);
        treeMapObj.put("r",100);
        treeMapObj.put("q",90);
        for(Map.Entry<String,Integer> tObj : treeMapObj.entrySet())
        {
            System.out.println(tObj.getKey()+" "+tObj.getValue());
        }
    }
}
