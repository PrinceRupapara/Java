import java.util.*;
public class Sum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter value of n:");
		int n=sc.nextInt();

		int sum[]=new int[n];

		int SUM=0;

		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Number=");
			sum[i] =sc.nextInt();

			if(sum[i]%3==0 || sum[i]%5==0)
			{
				SUM=SUM+sum[i];
			}
		}

		System.out.println("Sum="+SUM);
	}
}