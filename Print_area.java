import java.util.Scanner;
public class Print_area {
    public static double Area(double r) {
     return r*r*3.14;
        
    }
    public static double Area(double b,double h) {
        return 0.50*b*h;
    }
    public static int Area(int m) {
        return m*m;
    }

    public static void main(String arg[]) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter 1 for circle || Enter 2 for Triangle || Enter 3 for Square:");
       int n=sc.nextInt(); 
       switch (n) {
        case 1:System.out.print("Enter radius:");
                double r=sc.nextDouble();
                System.out.println("Area of circle"+Area(r));
                break;

        case 2:System.out.print("Enter base and height:");
                double b=sc.nextDouble();
                double h=sc.nextDouble();
                System.out.print("Area of Triangle"+Area(b, h));
                break;

        case 3:System.out.print("Enter  side:");
                int m=sc.nextInt();
                System.out.println("Area of square"+Area(m));
                break;

        default:System.out.println("invalid choice");
            break;
       }
    }
}
