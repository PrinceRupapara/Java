import java.util.*;
public class Prime{
	public static void main(String[] args) {

	  Scanner sc=new Scanner(System.in);

	  int a=sc.nextInt();
	  int count=0,i;

	  for(i=1; i<=a; i++){
	  	if (a%i==0) {
	  		count++;
	  	}
	  }

      if (count==2) {
      	System.out.println("Number is prime");
      }
      else{
      	System.out.println("Number is not prime");
      }

	}
}