import java.util.*;
public class Scoreboard{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a[];
        System.out.println("Enter size of array");
        int n=s.nextInt();
        a=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter the"+i+"element");
            a[i]=s.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.println("a[i]"+a[i]);
        }             
    }
}