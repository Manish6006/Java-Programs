import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;


public class RevWord{

	public static void main (String []args){
	

						  Scanner ins = new Scanner(System.in);
						  System.out.println("Enter a first String : ");
						  
						  String inputString=ins.nextLine(); 	// if it is a word, else in.nextLine()
						  
						  StringBuffer buff=new StringBuffer(inputString);
						  String finalString=buff.reverse().toString();
						  
						  System.out.println("the final string is:"+ finalString);
						  System.out.println("the length string is:"+ finalString.length());
						  String ch[]=finalString.split(" ");
						   System.out.println("the length string is:"+ ch.length);
						  
						/*char []ch=inputString.split(" ");*/
						

									for(int i=ch.length-1;i>=0;i--)
									{
										//System.out.println(i);
									System.out.print(ch[i]+" ");
						
									}
						  
						  
	 }
}
				