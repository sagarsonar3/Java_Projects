package com.advanceJava_MCABook.programs.Lambda;

interface Square
{
    public void area();
}
public class FunctionalInterfaceUsingAnonymousClasses
{
    public static void main(String[] args)
    {
        int side = 40;
        Square sObj = new Square()
        {
            @Override
            public void area()
            {
                System.out.println("Area of square : "+side*side);
            }
        };
         sObj.area();
    }
}
