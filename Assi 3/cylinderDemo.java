
import java.util.Scanner;

interface opration {
    
    public double pi=3.14;
    abstract double area();
    abstract double volume();
    abstract void display();
}
class cylinder implements opration{
    double radius,height;

    public cylinder(double radius,double height) {
            this.radius=radius;
            this.height=height;
    }
   public double  area(){
        return 2*pi*radius*(radius+height);
    }
    public double volume(){
        return pi*radius*radius*height;
    }
    public void display(){
        System.out.println("Area = "+area()+"volume = "+volume());
    }
}
class cylinderDemo{
    public static void main(String[] args) {
        double radius,height;
        Scanner sc =new Scanner(System.in);
        cylinder C ;
        System.out.println("Enter a radious and height of cylinder");
        radius=sc.nextDouble();
        height=sc.nextDouble();
        C = new cylinder(radius,height);
        C.display();
    }
}
