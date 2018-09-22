import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;


public class Occur{

	public static void main (String []args){
	
	//Set<Map.Entry<String, Double>> set = hm.entrySet();
						  Scanner ins = new Scanner(System.in);
						  System.out.println("Enter a String : ");
						 // System.out.println("First String:");
						  String s1=ins.nextLine(); 	// if it is a word, else in.nextLine()
						  
						  //Coverting String into Character
						  char ch[]=s1.toCharArray();
	
						//Declaring the Hashmap and Storing the value.
						HashMap<Character, Integer> hashMap=new HashMap<Character, Integer>();
						
						for(char str:ch)
						{
							 if (hashMap.containsKey(str)) {
								hashMap.put(str,hashMap.get(str)+1);
							 }
							 else{
								 hashMap.put(str,1);
								 
							 }
						}
						
						System.out.println("The printing array");
						//Set<hashMap<Character, Integer>> setmap= hashMap.entrySet();
						Set<Map.Entry<Character, Integer>> set = hashMap.entrySet();
						TreeMap<Character,Integer> treeMap=new TreeMap<Character,Integer>();
						
						treeMap.putAll(hashMap);
						
						for(Map.Entry<Character, Integer> map1:treeMap.entrySet())
						{
							System.out.println(map1);
						}
						
						//Without sorting 
						
						for(Map.Entry<Character, Integer>map1:set)
						{
							System.out.println(map1);
						}
	
	}
						  
						  
}
						  