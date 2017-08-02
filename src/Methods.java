import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		new Methods();
	}
	
	Methods()
	{
		
		System.out.println("Enter a number");
		
		Scanner s = new Scanner(System.in);
		
		double val=Double.parseDouble(s.nextLine());
		
		System.out.println("You entered " + val);
		
		double blah = uselessMethod(val);
		
		System.out.println("Did you know " + val + " squared is " + blah);
		
	}
	
	double uselessMethod(double v)
	{
		System.out.println("Hello from this useless method! Let me tell you something useful..");
		double square=v*v;
		return(square);
	}

}
