import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;


public class Anagram{

	public static void main (String []args){
	
	
						  Scanner ins = new Scanner(System.in);
						  System.out.println("Enter a first String : ");
						  
						  String str1=ins.nextLine(); 	// if it is a word, else in.nextLine()
						  
						  System.out.println("Enter a second string:");
						  String str2=ins.nextLine();
						  
						  String s1=str1.replaceAll("\\s"," ");
						  String s2=str2.replaceAll("\\s"," ");
						  
						  if(str2.length()!=str1.length())
						  {
							  System.out.println("the String is not same");
						  }
						  else{
							 
								char[] s1Array = s1.toLowerCase().toCharArray();
								char[] s2Array = s2.toLowerCase().toCharArray();
								
								Arrays.sort(s1Array);
								Arrays.sort(s2Array);
								
								Boolean status=Arrays.equals(s1Array,s2Array);
								if(status)
								{
									System.out.println("The both string are Anangram");
								}
								else{
									System.out.println("The both string are not Anagram");
								}
							  
						  }
	}
}
	