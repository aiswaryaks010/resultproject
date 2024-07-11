package firstcript;

public class nestedif {

	public static void main(String[] args) {
		int age=20,weight=56;
		if(age>18)
		{
		if(weight>55)
	
		{
			System.out.println("eligible for blood donation");
		}
		else
		{
			System.out.println("not eligible:minimum weight required is 55");
		}
		}
	  else 
		{
			System.out.println("not eligible for blood donation");
		}
}
	}

