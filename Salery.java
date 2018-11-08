import java.util.Scanner;
public class Salery
{
	public static void main(String[]args)
	{
	int sal,
	Scanner obj=new Scanner(System.in);

	System.out.println("Enter any number");
	sal=obj.nextInt();
	if(sal>5000)
	{
		b=(sal*10/100);
		sal=sal+b;
	}
	{
		System.out.println("Salery" + b);
	}
	}
}
