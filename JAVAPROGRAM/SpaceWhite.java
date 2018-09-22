import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;
import java.lang.Object;
//import org.apache.commons.lang3.StringUtils;

public class SpaceWhite{

	public static void main (String []args){
	
	
										Scanner ins = new Scanner(System.in);
						  System.out.println("Enter a String : ");
						 //System.out.println("Binary Value:");
						 String s1=ins.nextLine(); 	// if it is a word, else in.nextLine()
						 
						 System.out.println("After removien white space:"+ s1.replaceAll("a","@"));
	}
}
