import java.util.Scanner;
public class Input 
{
	public static void main(String args[])
	{
		int sum=0, a=1;
		Scanner sc=new Scanner(System.in);
		for(; a<=5; a++)
		{
			System.out.print("Enter "+a+" person weight:- ");
			int sc1=sc.nextInt();
			sum=sum+sc1;
		}
		int average=(sum/5);
		System.out.println("The average weight is:- " +average);
	}
}
