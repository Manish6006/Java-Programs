import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;
import java.lang.Object;
//import org.apache.commons.lang3.StringUtils;

public class StrPrint{

	public static void main (String []args){
	

						  Scanner ins = new Scanner(System.in);
						  //System.out.println("Enter a String : ");
						 System.out.println("First String:");
						  String s1=ins.nextLine(); 	// if it is a word, else in.nextLine()
						  
						  System.out.print("Output String Value 1 :"); 
							System.out.println(s1.toString()); 
							
							//Without using ToString
							
							 System.out.print("Output without String Value :"); 
							System.out.println(s1); 
							
							System.out.println("First String:");
							String Strobj2 = ins.nextLine(); 
							System.out.print("Output String Value 2 :"); 
							System.out.println(Strobj2.toString());
							
							
							//without using ToString 
							System.out.print("Output String Value 2 :"); 
							System.out.println(Strobj2);
	}
	
}


	