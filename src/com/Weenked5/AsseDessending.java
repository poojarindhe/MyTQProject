package com.Weenked5;
import java.util.Arrays;
import java.util.Scanner;
public class AsseDessending {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
        System.out.println("enter Array size :");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter array");
        for(int i=0;i<a.length;i++)
        {
        	a[i]=sc.nextInt(); 
        }
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length/2;i++)
        { 
        	for(int j=i;j<a.length/2;j++)
        	{
   		        if(a[i]>a[j]) 
   		        { 
   		        	int temp=a[i];
   		        	a[i]=a[j];
   		        	a[j]=temp;
   		        	} 
   		        }
        	} 
        for(int p=5;p<a.length;p++)
        {
        	for(int k=p+1;k<a.length;k++) 
        	{ 
        		if(a[p]<a[k])
        		{ 
        			int temp=a[p];
        			a[p]=a[k]; 
        			a[k]=temp; 
        			}
        		}
        	}
   		  System.out.println(Arrays.toString(a));
	}
}
