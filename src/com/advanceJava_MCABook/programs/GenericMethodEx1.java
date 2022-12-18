package com.advanceJava_MCABook.programs;

public class GenericMethodEx1
{
    public static<G> void print(G gObj)
    {
        System.out.println(gObj.getClass().getName());
    }

    public static void main(String[] args)
    {
        GenericMethodEx1.print("Abc");
        GenericMethodEx1.print(120);
        GenericMethodEx1.print('a');

    }
}
