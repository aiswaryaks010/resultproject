package firstcript;

import java.util.Scanner;

public class amstrong {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner as=new Scanner(System.in);
		int a=as.nextInt();
		int temp=a;
		int r,s=0;
		while(a>0)      //153>0
		{
		r=a%10;            //153%10=3
		s= s+r*r*r;           //0+3*3*3=27;
		a=a/10;                        //153/10
		}
		if(temp==s) {
			System.out.println("Amstrong");
		}
		else
		{
			System.out.println("Not Amstrong");

		}
		}

}
