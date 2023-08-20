import java.util.Scanner;

class Circle{
    /*. WAP to create Circle class with area and perimeter function to find area and perimeter of circle. */
    double redius;
    double area;
    double perimeter;
  
    Circle(){
        redius=0;
    }

    Circle(double r,double a,double p ){
        redius=a;
        area=a;
        perimeter=p;
    }
    public void get(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Redius of circle:");
        redius=sc.nextInt();
        area=3.14*redius*redius;
        perimeter=2*3.14*redius;
    }
    public void put(){
        System.out.print("Area of circle:"+area+"\nPerimeter of circle:"+perimeter);
    }
}


public class AreaOfCircle {
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.get();
        c1.put();
    }
}
