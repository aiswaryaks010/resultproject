package firstcript;

public class swap {

	public static void main(String[] args) {
		
		//swapping without variable
		int a=20,b=10;
		a=a+b;  //30
		b=a-b;  //20
		a=a-b;
		System.out.println("a="+a + "b="+b);
		
		//swapping with variable 
		
		int x=30,y=10,z;
		System.out.println("value of x before swapping="+x + "value of y swapping="+y);
		z=x;  //30
		x=y;   //10
		y=z;   //30
		System.out.println("value of x after swapping="+x + "value of y  after swapping="+y);
		
		int p=1072;
		System.out.println(p%10);
		
		
	}

}
