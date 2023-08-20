import java.util.*;
class Point2D{
    private int x;
    private int y;

    void setX(int x){
        this.x=x;
    }
    int getX(){
        return x;
    }
    void setY(int y){
        this.y=y;
    }
    int getY(){
        return y;
    }
    double getDistance(Point2D p){
        return Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y));
    }
}
class Point3D extends Point2D{
    private int z;

    void setZ(int z){
        this.z=z;
    }
    int getZ(){
        return z;
    }
    double getDistance(Point3D p){
        int x1=getX();
        int y1=getY();
        int z1=getZ();
        int x2=p.getX();
        int y2=p.getY();
        int z2=p.getZ();
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)+(z1-z2)*(z1-z2));
    }
}


public class TestPoint{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Point3D p1=new Point3D();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        p1.setX(x);
        p1.setY(y);
        p1.setZ(z);

        Point3D p2=new Point3D();
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        p2.setX(x);
        p2.setY(y);
        p2.setZ(z);      
        

        p1.getDistance(p2);
        System.out.println(p1.getDistance(p2));
    }
}