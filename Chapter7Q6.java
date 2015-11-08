import java.util.Scanner;


public class Chapter7Q6 {

	public static void main(String[] args) {
		
		System.out.println("Mexico Population in 2014 was 123.8 million");
		
		Scanner kboard= new Scanner(System.in);
		
		System.out.println("Enter your target population (in millions): ");
		double population =kboard.nextDouble();
		System.out.println("Year this population will be reached: "+ populationgrowth(population));
		
		//double x = populationgrowth(input);
			
	}
	public static double populationgrowth(double n) // n is place holder for parameter
	{
	
		double growth =1.005;
		int year= 2014;
		for (double population= 123.8; population < n; population =population*growth)
		{
				
			year++;
			}	
		
		
		return year;
		
	}



}





