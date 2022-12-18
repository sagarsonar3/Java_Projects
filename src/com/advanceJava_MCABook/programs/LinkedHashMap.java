package com.advanceJava_MCABook.programs;

import java.util.Map;

public class LinkedHashMap
{
    public static void main(String[] args)
    {
        Map<String,Character> ObjLinkedHashMap= new java.util.LinkedHashMap<>();
        ObjLinkedHashMap.put("SagarBloodGroup",'B');
        ObjLinkedHashMap.put("RishabhBloodGroup",'O');
        ObjLinkedHashMap.put("AlexBloodGroup",'A');

        for(Map.Entry<String,Character> entrySetObj : ObjLinkedHashMap.entrySet())
        {
            System.out.println("Key : "+entrySetObj.getKey() +" "+ "Value : "+entrySetObj.getValue());
        }

    }
}
