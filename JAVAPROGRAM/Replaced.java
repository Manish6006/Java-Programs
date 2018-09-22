import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;
import java.lang.Object;
//import org.apache.commons.lang3.StringUtils;

public class Replaced{

		static StringBuffer delete_sub(StringBuffer str)
		{
			return (str.deleteCharAt(7));
			
			
			
		}

		static StringBuffer Reverse(StringBuffer str)
		{
			return str.reverse();
			
			
		}

		static void PrintString(String s1){
			
			
			
			
		}

	public static void main (String []args){
	

						  Scanner ins = new Scanner(System.in);
						  System.out.println("Enter a String : ");
						 // System.out.println("First String:");
						  String s1=ins.nextLine(); 	// if it is a word, else in.nextLine()
						  
						  StringBuffer str=new StringBuffer(s1);
						  
						  System.out.println("the replaced string is:"+ str.replace(15,18,"for"));
						  
						  
						  
						  // //Code appending 
						  // System.out.println("Enter appending numbers");
						  // int num=ins.nextInt();
						  // System.out.println("The string after appending the string:"+ str.appendCodePoint(num));
						  
							System.out.println(delete_sub(str));
						  
						  // //Deleting the string value
						  
						 System.out.println("the string after REVERSE:"+ Reverse(str));
						  
						  
	}
}

	
	