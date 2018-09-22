import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;


public class Rotats{

	public static void main (String []args){
	
	
						  Scanner ins = new Scanner(System.in);
						  //System.out.println("Enter a String : ");
						  System.out.println("First String:");
						  String s1=ins.nextLine(); 	// if it is a word, else in.nextLine()
						  System.out.println("Second String:");
						  String s2=ins.nextLine(); 	// if it is a word, else in.nextLine()
						  
						  
						  
						  
						  
						  
						  if(s1==null || s2==null){
							  
							  System.out.println("The string is empty");
							  
						  }
						  else{
							  
							  if((s1+s1).contains(s2))
							  {
								  
								  System.out.println("The string is present");
							  }
							  else{
								 System.out.println("The string is not present"); 
							  }
							  
						  }
						   
						
						
	}



}
	