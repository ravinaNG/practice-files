import java.util.Scanner;
public class Imput
{
	public static void main(String[] args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("type any number:-");
		for(int a=0; a<5; a++)
		{
			int number = sc.nextInt();
			sum=sum+number;
		}
		System.out.println(sum);
		System.out.println(sum/5);
	}
		

}
