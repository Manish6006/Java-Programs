import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;


public class Preserving{

	public static void main (String []args){
	

						  Scanner ins = new Scanner(System.in);
						  System.out.println("Enter a first String : ");
						  
						  String inputString=ins.nextLine(); 	// if it is a word, else in.nextLine()
						  
						  char[] inputStringArray = inputString.toCharArray();
         
        //Defining a new char array 'resultArray' with same size as inputStringArray
         
        char[] resultArray = new char[inputStringArray.length];
         
        //First for loop : 
        //For every space in the 'inputStringArray', 
        //we insert spaces in the 'resultArray' at the corresponding positions 
         
        for (int i = 0; i < inputStringArray.length; i++) 
        {
            if (inputStringArray[i] == ' ') 
            {
                resultArray[i] = ' ';
            }
        }
         
        //Initializing 'j' with length of resultArray
         
        int j = resultArray.length-1;
                 
        //Second for loop :
        //we copy every non-space character of inputStringArray 
        //from first to last at 'j' position of resultArray
         
        for (int i = 0; i < inputStringArray.length; i++)
        {
            if (inputStringArray[i] != ' ') 
            {
                //If resultArray already has space at index j then decrementing 'j'
                 
                if(resultArray[j] == ' ')
                {
                    j--;
                }
                 
                resultArray[j] = inputStringArray[i];
                 
                j--;
            }
        }
         
        System.out.println(inputString+" ---> "+String.valueOf(resultArray));
						  
						  
						  
						  
						  
						/*  char ch[]=str1.toCharArray();
						  
						  char ch1[]=new char[str1.length];
						  
						  for(int i=0;i <ch.length;i++){
							  
								if(ch[i]=="")
								{
									
									ch1[i]="";	
								}
						  }
						  
						int j=ch1.length-1;
						
						for(int i=0;i <ch.length;i++)
						{
							
							if(ch[i]!="")
							{
								
								if(ch1[i]=="")
								{
									j--;
									
								}
								ch1[j]=ch[i];
								j--;
							}
						}
			System.out.println("the final result array:"+String.valueOf(ch1));*/


	
	}
}
	