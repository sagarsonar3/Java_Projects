package com.practiceexample;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseArrayFourWays
{
    //1st way using temp array
   /* static void reverse(int a[], int noOfelement )
    {
        int[] temparr = new int[noOfelement];
        int j = noOfelement;
        for (int i = 0; i < noOfelement; i++) {
            temparr[j - 1] = a[i];
            j = j - 1;
        }

        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < noOfelement; k++) {
            System.out.println(temparr[k]);
        }
    }

    public static void main(String[] args)
    {
        int [] arr = {10, 20, 30, 40,9,100,28, 50};
        reverse(arr, arr.length);
    }*/

    //2nd way Using swapping method = best way

/*    static void reverseArrayUsingSwap(int arr[],int noOfElements)
    {
        int temp;
        int varOfNewArray;
        int i;

        for(i=0;i<noOfElements/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[noOfElements-i-1];
            arr[noOfElements-i-1]=temp;
        }

        for( varOfNewArray =0 ; varOfNewArray<noOfElements ; varOfNewArray++)
        {
            System.out.println(arr[varOfNewArray]);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        reverseArrayUsingSwap(arr, arr.length);
    }*/

    //3rd way -Using Collections.reverse() method

   /* static void reverseUsingCollection(Integer arr[])
    {
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));
    }
    public static void main(String[] args) {
        Integer[] arr = { 1, 20,9,100, 30, 40, 50 };
        reverseUsingCollection(arr);
    }*/

    // 4th way - Using StringBuilder.append() method
    public static void main(String[] args) {
        String[] arr = {"sagar","pradeep","sonar"};
        StringBuilder reversed = new StringBuilder();
        for(int i= arr.length;i>0;i--)
        {
            reversed.append(arr[i-1]).append(" ");
        }
        String[] reversedArray = reversed.toString().split("");
        System.out.println(reversed);
    }

}
