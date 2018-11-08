import java.util.Scanner;
public class LoopAverage
{
	public static void main(String args[])
	{
		int sum=0, a=1;
		Scanner sc=new Scanner(System.in);
		for(; a<=5; a++)
		{
			System.out.print("Enter "+a+" person weight:- ");
			int weight=sc.nextInt();
			sum=sum+weight;
		}
		int average=(sum/5);
		System.out.println("The average weight is:- " +average);
	}
}
