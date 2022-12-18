package com.advanceJava_MCABook.programs;

public class GenericClassEg<T>
{
    private T t ;
    public void add(T t)
    {
        this.t = t ;
    }
    public T get()
    {
        return t;
    }

    public static void main(String[] args)
    {
        GenericClassEg<Integer>  intObj = new GenericClassEg<Integer>();
        GenericClassEg<String> stringObj = new GenericClassEg<String>();
        intObj.add(new Integer(100));
        stringObj.add("SagarSonar");
        System.out.printf("Integer value : %d\n\n",intObj.get());
        System.out.printf("String value : %s\n",stringObj.get());
    }
}
