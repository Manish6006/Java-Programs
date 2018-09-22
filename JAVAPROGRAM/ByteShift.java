

class ByteShift {
public static void main(String args[]) {



					/*byte a = 64, b;
					int i;
					
					
					i = a << 2;
					b = (byte) (a << 2);
					System.out.println("Original value of a: " + a);
					System.out.println("i and b: " + i + " " + b);*/
					

					int i; 
					int num = 0xFFFFFFE; 
					System.out.println(num); 
					//for(i=0; i<4; i++) { 
					num = num << 1; 
					System.out.println("after shift"+num); 

				}
}
