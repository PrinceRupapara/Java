import java.util.*;
public class EvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter value of n:");
		int n=sc.nextInt();

		int eo[]=new int[n];

		int even=0,odd=0;

		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Number=");
			eo[i] =sc.nextInt();

			if(eo[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		} 

		System.out.println("Even="+even);
		System.out.println("Odd="+odd);
	}
}