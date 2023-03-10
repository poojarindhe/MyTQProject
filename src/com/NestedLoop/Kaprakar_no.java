package com.NestedLoop;

import java.util.Scanner;

public class Kaprakar_no {

		public static boolean isKaprekar(int number) {

		      // declare variables
		      int square = 0;
		      int temp = 0;
		      int countDigits = 0;
		      int firstPart = 0;
		      int secondPart = 0;
		      int sum = 0;

		      // calculate square value of the number
		      square = number * number;

		      // count number of digits in the square
		      temp =square;
		      while(temp!=0) {
		         countDigits++;
		         temp /= 10; 
		      }

		      // divide square into two parts and 
		      // check it's sum is equal to the number?
		      for(int i=countDigits-1; i>0; i--) {

		         // find first part
		         firstPart = square / (int)Math.pow(10, i);
		         // find second part
		         secondPart = square % (int)Math.pow(10, i);

		         // check have any part only 0
		         if(firstPart == 0 || secondPart == 0)
		         	continue;
		         // find sum value
		         sum = firstPart + secondPart;

		         // compare sum and number
		         if( sum == number )
		         return true;
		      }
		      return false;
		   }

		   public static void main(String[] args) {

		      // declare variables
		      int number = 0; 

		      // read the input 
		      Scanner scan =  new Scanner(System.in);
		      System.out.print("Enter an integer number:: ");
		      number = scan.nextInt();

		      // check the number is kaprekar number or not
		      if(isKaprekar(number))
		      System.out.println(number+" is a"
				    	+ " kaprekar number");
		      else
		      System.out.println(number+" is not a"
			      	  	+ " kaprekar number");

		      // close Scanner class object
		      scan.close();
		   }

		

	}


