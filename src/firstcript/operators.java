package firstcript;

public class operators {

	public static void main(String[] args) {
	//ARITMETIC OPERATOR
		
		int x=30,y=10;
		System.out.println("x+y="+(x+y));
		System.out.println("x-y="+(x-y));
		System.out.println("x*y="+(x*y));
		System.out.println("x/y="+(x/y));// answer will be quotient
		System.out.println("x%y="+(x%y));// answer will be remainder
		
		
		
		//ASSIGNMENT OPERATOR
		
		System.out.println("x+y="+(x+=y));  // x=x+y  30+10=40
		System.out.println("x-y="+(x-=y));  //x=x-y   40-10=30
		System.out.println("x*y="+(x*=y));           //30*10=300
		System.out.println("x/y="+(x/=y));      // 300/10=30
		
		//RELATIONAL OPERATOR
		
	int a=10,b=20;
	System.out.println(a==b);
	System.out.println(a>=b);
	System.out.println(a<=b);
	System.out.println(a!=b);
	System.out.println(a<b);
	System.out.println(a>b);
	
	//LOGICAL OPERATOR
	
	String username ="Aiswarya";
	String dob="2001";
	
	System.out.println(username=="Aiswarya" && dob=="2001");  //true
	System.out.println(username=="Aiswarya" || dob=="2001");  //true
	System.out.println(!(username=="Aiswarya"));              //false
	System.out.println(!(dob=="2001"));                       //false
	System.out.println(username=="Aiswarya" && dob=="2002");  //false
	System.out.println(username=="Aiswarya" || dob=="2002");   //true
	System.out.println(username=="Aiswarya");     //true
	System.out.println(dob=="2001");              //true
	
	
	//UNARY OPERATOR
	
	int p= 3;
	System.out.println(p++);
	System.out.println(p);
	System.out.println(++p);
	
	System.out.println(p--);
	System.out.println(p);
	System.out.println(--p);
	
	//TERNARY OPERATOR
	
	//variable=condition?exp1:exp2;
	
	String ans=a>b?"a is greater":"b is greater";
	System.out.println(ans);
	
	
	}

}
