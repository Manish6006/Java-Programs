import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;


public class Rotational{

	public static void main (String []args){
	
	
						  Scanner ins = new Scanner(System.in);
						  System.out.println("Enter a first String : ");
						  
						  String str1=ins.nextLine(); 	// if it is a word, else in.nextLine()
						  
						  System.out.println("Enter a second string:");
						  String str2=ins.nextLine();
						  
						  if(str1.length()==str2.length())
						  {
							  String str3=str1+str1;
							  
							  if(str3.contains(str2))
							  {
								  System.out.println("the str2 is rotaional version of the str1");
							  }
							  else{
								  System.out.println("the str2 is not rotaional version of str1");
							  }
							  
							  
						   }
						   else{
							   
							   System.out.println("the string is not same");
						   }
						  
						  
						  
						  
		}
}
		