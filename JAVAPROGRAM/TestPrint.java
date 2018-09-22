import java.io.*;
import java.util.Map;
import java.util.*;
import java.util.HashMap;
import java.lang.Object;
//import org.apache.commons.lang3.StringUtils;

public class TestPrint{

	public static void main (String []args){
	
String raw = "100";

    int[] num = new int[raw.length()];
double sum=0;
int k=0;

    for (int i = 0; i < raw.length(); i++){
        num[i] = raw.charAt(i) - '0';
		sum=sum + (Math.pow(2,k))*num[i];
																		k++;
    }

	System.out.println("The DecimalFormat is:"+ sum);
	
/*     for (int i : num) {
        System.out.print(i);
    }
	 */
	}
}
	