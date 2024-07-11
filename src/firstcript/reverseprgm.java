package firstcript;

import java.util.Scanner;

public class reverseprgm {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner var=new Scanner(System.in);
		int a=var.nextInt();
		int temp=a;
		int reverse=0,rem;
		while(a>0)  //256>0   //25>0    //2>0
		{
			rem=a%10;  //256%10=6          //25%10=5   //2%10=2
			reverse=reverse*10+rem;   //0*10+6=6    //6*10+5=65   //65*10+2=652
			a=a/10;               //256/10=25        //25/10=2       //2/10=0
			
		}
		/*if(temp==reverse)
		{
			System.out.println("entered number is plaindrome");
		}
			else
			{
				System.out.println("not palindrome");
			}*/
		
		
		System.out.println("reverse of number=" +reverse);

	}

}
