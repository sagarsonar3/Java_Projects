package com.advanceJava_MCABook.programs;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hashmap_Eg
{
    public static void main(String[] args)
    {
        Map<String,Integer> mapObj = new HashMap<>();
        mapObj.put("Steve",102);
        mapObj.put("Andrew",20);
        mapObj.put("Prasad",1);
        mapObj.put("Duckett",108);

        for(Map.Entry<String,Integer> obj : mapObj.entrySet())
        {
            System.out.println("Key : "+obj.getKey() +" "+ "Value : "+obj.getValue());
        }

    }
}
