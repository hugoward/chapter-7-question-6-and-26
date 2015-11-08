import java.util.Scanner;

public class mexico {
	static int startYear=2014;
	static double startPopulation = 123.8;
	static double growthRate= 1.005;
	
	public static void main(String[] args) {
		
		Scanner kboard= new Scanner(System.in);
		System.out.print("Target Population number: ");
		double targetPopulation = kboard.nextDouble();
		double newPopulation= startPopulation;
		int yearCounter=0;
		
		while (newPopulation<targetPopulation)
		{
			//System.out.println("in "+startYear+yearCounter);
			newPopulation*=growthRate;
			yearCounter++; //add one to the year spent
		}
		int targetYear= startYear+yearCounter;
		System.out.println("In "+targetYear+ ", the population will reach "+ targetPopulation);
	}

}
