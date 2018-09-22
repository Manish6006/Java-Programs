import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;


public class Percent{

	public static void main (String []args)
	{
		
						  Scanner ins = new Scanner(System.in);
						  System.out.println("Enter a first String : ");
						  
						  String inputString=ins.nextLine(); 	// if it is a word, else in.nextLine()
							
							//char [] str=inputString.toCharArray();
							char ch;
							int count_up=0,count_lo=0,count_di=0,count_sp=0;
							
							for(int i=0;i<inputString.length();i++)
							{
								 ch=inputString.charAt(i);
								
									//upparCase character is counting 
									if(Character.isUpperCase(ch))
									{
										System.out.println("Got Uppar case");
										count_up++;
										//sum=sum+count_up;
									}
									
									//Lowercase character is counting 
									if(Character.isLowerCase(ch))
									{
										System.out.println("Got lower case");
										count_lo++;
										//sum=sum+count_lo;
									}
									
									//Digit is counting 
									if(Character.isDigit(ch))
									{
										System.out.println("Got digit");
										count_di++;
										//sum=sum+count_di;
									}
									
									//Special character printing
									
									if(ch=='!'||ch=='@'||ch==']'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='*'||ch=='/'||ch=='.')
									{
										System.out.println("the special character"+ch);
										count_sp++;
										//sum=sum+count_sp;
									}

							}
							
							int total=count_up+count_lo+count_di+count_sp;
							
							float res1=(count_up*100)/total;
							float res2=(count_lo*100)/total;
							float res3=(count_di*100)/total;
							float res4=(count_sp*100)/total;
							
							System.out.println("Total"+ total );
							System.out.println("The percenatage of uppar case is:"+ res1);
							System.out.println("The percenatage of lower case is:"+ res2);
							System.out.println("The percenatage of digit case is:"+ res3 );
							System.out.println("The percenatage of special case is:"+ res4 );
							
						//Tiger Runs @ The Speed Of 100 km/hour.
    
}
	
}
