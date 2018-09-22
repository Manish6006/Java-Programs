import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;


public Class Reverse{

			public static void main(String [] args){

						  Scanner ins = new Scanner(System.in);
						  System.out.println("Enter a String : ");
						  String str=ins.nextLine(); 	// if it is a word, else in.nextLine()
						
						
						HashMap<String> hashMap= new HashMap<String>();
						
						for(String words:str)
						{
							hashMap.put(words);
							
							
						}
						
						for(String word: hashMap.keySet())
						{
							System.out.println(word);
						}
						



		}


}