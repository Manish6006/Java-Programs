import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;


public class Opposite{

	public static void main (String []args){
	
	
						  Scanner ins = new Scanner(System.in);
						  System.out.println("Enter a String : ");
						  String str=ins.nextLine(); 	// if it is a word, else in.nextLine()
						  
						  
						  StringBuffer strBuff=new StringBuffer(str);
						  
						  System.out.println("The reverse of the string:"+ strBuff.reverse().toString());
						  
	
	
	}
}
	
