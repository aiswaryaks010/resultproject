package firstcript;

import java.util.Scanner;

public class calculatorscannerdowhileprgm {

	public static void main(String[] args) {
		int choice;
		do {
		System.out.println("enter first number");
		System.out.println("enter second number");
		Scanner cal= new Scanner(System.in);
		int a=cal.nextInt();
		int b=cal.nextInt();
		System.out.println("enter your choice:1.add 2.sub 3.mul 4.div");
	    choice=cal.nextInt();
		switch(choice)
		{
		case 1:System.out.println(a+b);
		break;
		case 2:System.out.println(a-b);
		break;
		case 3:System.out.println(a*b);
		break;
		case 4:System.out.println(a/b);
		break;
		default:System.out.println("invalid");
		}
		}while(choice>0&&choice<=4);
	}
}

	


