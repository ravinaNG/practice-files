import java.util.Scanner;
public class      Multiply                                                                                                                                                                                                                                                                                                                        
{
	public static void main(String good[])
	{
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("type first number:-");
		int a=sc.nextInt();
		System.out.println("type second number:-");
		int b=sc.nextInt();
		for(;b>=1; b--)
		{
			c=c+a;
		}
		System.out.println(c);
	}	
}
