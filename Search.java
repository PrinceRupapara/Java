import java.util.*;
public class Search
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter size of Array=");

		int n=sc.nextInt();

		int a[]=new int[n];

		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Element:");
			a[i]=sc.nextInt();
		}

		System.out.print("Enter Element Which you want to Search=");
		int m=sc.nextInt();

		for(int i=0;i<n;i++)
		{
			if(m==a[i])
			{
				System.out.println("Element Found="+a[i]);
				break;
			}
		else if (i==n-1 && a[i]!=m)
		{
			System.out.println("Element Not Found=");
				break;
		}

		else
		{
			continue;
		}
		}
	}
}