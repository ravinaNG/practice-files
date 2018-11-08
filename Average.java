import java.util.Scanner;
public class Average
{
	public static void main(String arg[])
	{
		int sum=0, a=1;
		Scanner sc=new Scanner(System.in);
		for(; a<=5; a++)
		{
			System.out.print("type "+a+" weight:-");
			int weight=sc.nextInt();
			sum=sum+weight;
		}
		int average=(sum/5);
		System.out.println(average);
	}
}
