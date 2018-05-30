package basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		// Create a variable to define our career
		
		//declare a variable
		String career;
		System.out.println("program is starting");
		
		//define a variable
		career = "Software Developer";
		System.out.println("My career is " + career);
		
		//Declare & Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		//Compute our annual salary
		//rate * hoursPerWeek * weeksPerYear
		
		double salary = rate * hoursPerWeek * weeksPerYear;
		System.out.println("My salary as a " + career + " at the rate of $"+ rate + " per hour is $" + salary + "  per year.") ;

	}

}
