import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;
import java.lang.Object;
//import org.apache.commons.lang3.StringUtils;

public class AddingAppend{

	public static void main (String []args){
	

						  Scanner ins = new Scanner(System.in);
						  System.out.println("Enter a String : ");
						 // System.out.println("First String:");
						  String s1=ins.nextLine(); 	// if it is a word, else in.nextLine()
						  
						  StringBuilder str=new StringBuilder(s1);
						  StringBuffer strBuffer=new StringBuffer(s1);
						  
						  //before appending the string
						  System.out.println("The string is"+ str.toString());
						  
						  //after adding the string
						  str.append("last");
						  
						  System.out.println("The final string is:"+str);
						  System.out.println("The final stringBuffer is:"+strBuffer);
	}
}
	