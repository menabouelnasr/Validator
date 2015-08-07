import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validation 
{
	int age, weight, height;
	double decimal;
	public static boolean getName(String prompt)
	{
		String name = "[a-zA-Z]+";
		Pattern pattern = Pattern.compile(name);
		Matcher match = pattern.matcher(prompt);
	    return match.matches();
	    
	}

	public static int getAge(int prompt)
	{
	    int i = 0;
	    boolean isValid = false;
	    while (isValid == false)
	    {
	        if (prompt<=0 || prompt>=100)
	        {
	            System.out.println( "Error! Invalid age value. Try again.");
	        	break;
	        }
	        else
	        	isValid= true;
	    }
		return 1;
	
	}

	public static int getHeight(int prompt)
	{
	    int i = 0;
	    boolean isValid = false;
	    while (isValid == false)
	    {
	    	if (prompt<=36 || prompt>=92)
	    	{
	            System.out.println( "Error! Invalid height value. Try again.");
	    		break;
	    	}
	    	else
	    		isValid = true;
	    }
	    return 1;
	}

	public static int getWeight(int prompt)
	{
	    boolean isValid = false;
	    while (isValid == false)
	    {
		    if (prompt<=80 || prompt>=400)
		    {
	            System.out.println("Error! Invalid height value. Try again.");
	            break;
		    }
	        else
	        	isValid = true;
	       
	    }
	    return 1;
	}

	public static double getDecimal(double prompt)
	{
	    double d = 0;
	    boolean isValid = false;
	    while (isValid == false)
	    {
	    	if (prompt<=0.0 || prompt>=1.0)
	    	{
	            System.out.println("Error! Invalid decimal value. Try again.");
	            break;
	    	}
	        else
	        	isValid = true;
	        
	    }
	    return d;
	}
}
