package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InsertElementInArray
{

    public static void main(String[] args)
    {
        int n, pos, newElementToBeAdded;
        Scanner s = new Scanner(System.in);
        n = 5;
        int a[] = {11,2,200,1010,5,29};
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        pos = 3;
        newElementToBeAdded = 100000;
        for(int i = (n-1); i >= (pos-1); i--)
        {
            a[i+1] = a[i];
        }
        a[pos-1] = newElementToBeAdded;
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[n]);
    }
}
