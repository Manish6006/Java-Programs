/*
Write a program to send all the ZERO's to the right of aan array.
i/p : [1, 4, 0, 5, 0, 0, 2, 0, 4, 0, 0 ,0, 6]
o/p :[1, 4, 5, 2, 4, 6, 0, 0, 0, 0, 0, 0, 0]
*/

import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;

public class ZeroShift{

	public static void main(String [] args)
	{
	
				int [] arr1=new int[] {1,4,0,5,0,0,2,0,4,0,0,0,6};
				int len=arr1.length;
				int [] arr2=new int [len];
				int [] arr3=new int [len];
			
				System.out.println(len);
				 
				for(int i=0;i<len;i++)
				{
					if(arr1[i]!=0)
					{
						
						arr2[i]=arr1[i];
						
					}
				
				
				
				}
	}
}

	