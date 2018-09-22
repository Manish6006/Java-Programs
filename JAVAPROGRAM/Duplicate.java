import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;


public class Duplicate{

			public static void main(String [] args){

						  Scanner ins = new Scanner(System.in);
						  System.out.println("Enter a String : ");
						  String str=ins.nextLine(); 	// if it is a word, else in.nextLine()
						  String strr[]=str.split(" ");
						
						
						HashMap<String,Integer> hashMap= new HashMap<String,Integer>();
						
						for(String words:strr)
						{
							hashMap.put(words,hashMap.get(words));
							
							
						}
						
						for(String word: hashMap.keySet())
						{
							System.out.println(word);
						}
						



		}


}