import java.util.Scanner;


public class Inputs 
{

	public static void main(String[] args) 
	{
		Scanner keyboard= new Scanner(System.in);
		String name, choice="y";
		int age;
		int weight;
		int height;
		double decimal;
		
		while (choice.equalsIgnoreCase("y"))
		{
		System.out.println("Please enter your name.");
		name=keyboard.next();
		
		System.out.println("Please enter your age.");
		age=keyboard.nextInt();
		
		System.out.println("Please enter your height in inches.");
		height=keyboard.nextInt();
		
		System.out.println("Please enter your weight in pounds.");
		weight=keyboard.nextInt();
		
		System.out.println("Please enter your favorite decimal.");
		decimal=keyboard.nextDouble();
		
		boolean promptName = Validation.getName(name);
		int promptAge = Validation.getAge(age);
		int promptHeight = Validation.getHeight(height);
		double promptDecimal = Validation.getDecimal(decimal);
			
		System.out.println("Would you like to enter another set of information?");
		choice=keyboard.next();
		                
		}

	}

}
