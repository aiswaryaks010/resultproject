package firstcript;

public class whileprgm {

	public static void main(String[] args) {
	int count=0; 
		int num=1234; 
		while(num>0)          //1234>0  //123>0   //12>0  //1>0
		{
			num=num/10;         //1234/10=123 //123/10=12    //12/10=1   //1/10=0                             
			count++;               //1   //2  //3  //4
		}
System.out.println("count="+count);
	}

}
