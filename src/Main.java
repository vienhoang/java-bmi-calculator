
public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Vien's BMI Calculator");
		
		String inputKg = InputHelper.getInput("Enter your weight in KG: ");
		String inputM = InputHelper.getInput("Enter your height in Meters: ");
		
		double kg = Double.parseDouble(inputKg);
		double meters = Double.parseDouble(inputM);
		// pow = d2*d2
		double bmi = kg / Math.pow(meters,2);
		// Clever way to get 2 decimals
		// Round up to the nearest integer with Math.round
		double roundedBmi = (double) Math.round(bmi * 100) / 100;
		
		System.out.println("\nYour BMI is: " + roundedBmi +"\n");
		
		System.out.println("Underweight = Less than 19");
		System.out.println("Normal weight = 19–25"); 
		System.out.println("Overweight = 26–30"); 
		System.out.println("Obesity = 30 or greater");

	}


}
