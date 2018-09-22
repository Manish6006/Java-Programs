
import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;


public class CharAt_IndexOf_Example {
   public static void main(String args[]){
      String str = "This is tutorialspoint";
      System.out.println("Index of letter 't' = "+ str.indexOf('t', 14));
      System.out.println("Letter at the index 8 is ::"+str.charAt(8));
	  System.out.println("Index of letter 't' = "+ str.indexOf('t'));
   }
}