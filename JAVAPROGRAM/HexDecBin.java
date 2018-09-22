import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;
import java.lang.Object;
//import org.apache.commons.lang3.StringUtils;

public class  HexDecBin{

										//Print Binary To DecimalFormat
										
										public static void BinToDec(String s1){
																		System.out.println("The DecimalFormat is:"+ Integer.parseInt(s1,2));
										}
						
									//Print Binary To Hexa
										
										public static void BinToHexa(String s1){
											
																			System.out.println("The hexadecimal format number:"+ Integer.toHexString(Integer.parseInt(s1,2)));
											
										}
	
										//Print Hexa To DecimalFormat
										
									public static void HexaToDec(String s2){
											
																			System.out.println("The DecimalFormat number is:" + Integer.parseInt(s2,16));
											
										} 
	
										//Print Hexa To Binary
										
										public static void HexaToBin(String s2){
											
											
																	int tempInt=Integer.parseInt(s2,16);
																	String temp=Integer.toBinaryString(tempInt);
																		//int result=Integer.parseInt(temp,2);
																	System.out.println("The Hexa to Binary format number :"+temp);
										}
	
	
	
	public static void main (String []args){
	

						  Scanner ins = new Scanner(System.in);
						  //System.out.println("Enter a String : ");
						 System.out.println("Binary Value:");
						 String s1=ins.nextLine(); 	// if it is a word, else in.nextLine()
					
								
									BinToDec(s1);
								//Print Binary To DecimalFormat
							 BinToHexa(s1);	//Print Binary To Hexa
							 
							 System.out.println("Enter a Hexa Value : ");
							 
							 String s2=ins.nextLine(); 	// if it is a word, else in.nextLine()
							
							HexaToDec(s2);		//Print Hexa To DecimalFormat
							HexaToBin(s2);	//Print Hexa To Binary
							
							
	}
}


	