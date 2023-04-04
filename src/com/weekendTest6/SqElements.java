package com.weekendTest6;

import java.util.Arrays;

public class SqElements {




 public static void replaceNegativeWithLeftSquare(int[] arr)
{
    for (int i = 1; i < arr.length; i++) 
    {
        if (arr[i] < 0) 
        {
            arr[i] = arr[i-1]*arr[i-1];
        }
    }
}
 

public static void main(String[] args)
{
int[] arr = {12, 3, -19, 29, 5, -61, 44, 7, -9};
replaceNegativeWithLeftSquare(arr);
System.out.println(Arrays.toString(arr));

}

}


