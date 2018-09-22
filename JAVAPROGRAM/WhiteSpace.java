import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;


public class WhiteSpace{

	public static void main (String []args){
	
	
						  Scanner ins = new Scanner(System.in);
						  System.out.println("Enter a String : ");
						  String str=ins.nextLine(); 	// if it is a word, else in.nextLine()
						
						  String str1=str.replaceAll("\\s","");
						  
						  
						  System.out.println("The final string is:"+ str1);
	}


}


	