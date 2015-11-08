import java.util.Scanner;

public class chapter7question26 {

	public static void main(String[] args) {
		
//returns GCF of a and b
		//Precondition: a>0, b>0
		
		System.out.println("enter the first number: ");
		Scanner scanner1 = new Scanner(System.in);
		int input1 = scanner1.nextInt();
		
		System.out.println("enter the second number: ");
		Scanner scanner2 = new Scanner(System.in);
		int input2 = scanner2.nextInt();
		
		int x = GCF(input1,input2);
		
		System.out.println("greatest common factor is: " + x);
	}
	public static int GCF(int a , int b)	
		  {
		    while(a!=0 && b!=0) // until either one of them is 0
		    {
		       int temp = b;
		       b = a%b;
		       a = temp;
		    }
		     
		  return a+b; // either one is 0, so return the non-zero value
		
  
	  
	  
	}
}
