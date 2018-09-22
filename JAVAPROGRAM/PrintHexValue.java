import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;
import java.lang.Object;
//import org.apache.commons.lang3.StringUtils;

public class PrintHexValue{


					public static void AsciiToHex(StringBuffer str, char [] ch){
								
												for(int i=0; i<ch.length; i++){
																str.append(Integer.toHexString( (int) ch[i] ));
							  
												}
													  System.out.println("The Hex value of given string is:" + " <"+ str+ ">");
						 System.out.println("Using string method:" + " <"+ str.toString()+ ">");
							}
						
						public static void HexToAscii(String str){

								StringBuilder output=new StringBuilder();
								
								for(int i=0; i<str.length(); i+=2){
									
											String chr=str.substring(i,i+2);
											output.append((char) Integer.parseInt(chr,16));
								}								
							System.out.println("The HEX to ASCIII:" + "<"+ output+">");
						}

						//ASCII TO BINARY
						public static void AsciiToBinary(StringBuffer str,char[] ch){
						
											for(int i=0; i<ch.length; i++){
							
							
													str.append(Integer.toBinaryString((int) ch[i]));
												}
							
												System.out.println("The binary string is:"+"<"+ str+">");
						
						
						}


	public static void main (String []args){
	
	
	/*Convert a string to ASCII exadecimal to values
*	Convert a string to hexadecimal ASCII values
*
*
*/


						  Scanner ins = new Scanner(System.in);
						  
						  //System.out.println("Enter a String : ");
						 System.out.println("First String:");
						  
						  String s1=ins.nextLine(); 	// if it is a word, else in.nextLine()
						  
						  
						  char ch[]=s1.toCharArray(); // Converting string to char array
						 
						StringBuffer str=new StringBuffer();
						
						 AsciiToHex(str,ch);
						 HexToAscii(s1);
						 
						 System.out.println("Enter a String : ");
						 
						AsciiToBinary(str,ch); 
						 HexaToDEC(s1);
						  
	}
}
