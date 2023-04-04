package com.array;

import java.util.Arrays;

public class CharAternate {

	public static void main(String[] args) 
	{
      char ch[]= {'a','i','Z','M','D','y','Y'};
      
      System.out.println(Arrays.toString(ch));
      for(int i=0;i<ch.length;i++)
      {
    	  if( ch[i]=='z'|| ch[i]=='y' || ch[i]=='Y' || ch[i]=='Z')
    	  {
    		  ch[i]=(char)(ch[i]-24);
    	  }
    	  else
    	  {
    		  ch[i]=(char)(ch[i]+2);
    	  }
    	  
			/*
			 * else if(ch[i]>='a' && ch[i]<='z' ) { ch[i]=(char) (ch[i]+2); } else
			 * if(ch[i]>='A' && ch[i]<='Z') { ch[i]=(char) (ch[i]+2); }
		
			 */
    
      }
      System.out.println(Arrays.toString(ch));
      
      
	}

}
