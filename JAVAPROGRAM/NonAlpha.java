import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;


public class NonAlpha{

	public static void main (String []args){
	
	
						  Scanner ins = new Scanner(System.in);
						  System.out.println("Enter a String : ");
						 // System.out.println("First String:");
						  String s1=ins.nextLine(); 	// if it is a word, else in.nextLine()
					
						  /*
						  * Removing Non alphabet 
						  *
						  */
						  
						  
						  if(s1.length()!=0){
						  char ch[]=s1.toCharArray();
						  
									for(int i=0;i<s1.length();i++){
									char chh=ch[i];
												if(Character.isLetter(chh)){
													
													System.out.println(ch[i]);
												}
									}
						  
						  
						  
						  }
						  else{
							  System.out.println("String is empty");
						  }
						  
						  
	}
	
}


	