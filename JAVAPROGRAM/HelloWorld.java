import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;

public class HelloWorld{

     public static void main(String []args){
 
 //int count=0;
      Scanner ins = new Scanner(System.in);
     System.out.println("Enter a String : ");
    String str=ins.nextLine(); 	// if it is a word, else in.nextLine()

	
/*String word[]=str.split(" ");

for(String wordss: word)
{
	count=count+1;
	
}
System.out.println("the total number of words:"+ count);
*/

//HashMap<String, Integer> hashMap= new HashMap<String, Integer>();
HashMap<Character, Integer> hashMap=new HashMap<Character, Integer>();

for(int i=0;i<str.length();i++)
{

        if(hashMap.containsKey(str.charAt(i)))
        {
            hashMap.put(str.charAt(i),hashMap.get(str.charAt(i))+1);
        }
        else
        {
            hashMap.put(str.charAt(i),1);
        }
}

//printing the value

for(char ch: hashMap.keySet())
{
    
    System.out.println(ch+"  "+hashMap.get(ch));
}



     }	
}