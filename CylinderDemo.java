/*Define an interface “Operation” which has methods area(),volume().Define a 
constant PI having a value 3.142.Create a class cylinder which implements this 
interface (members – radius, height) Create one object and calculate the area 
and volume.*/

interface opration{

        double PI=3.14;
        double area();
        double volume();
}
class Cylinder implements opration{

        double radius;
        double height;

    public Cylinder(double radius,double height) {
            this.radius=radius;
            this.height=height;
    }
    public double area(){
        return 2 * PI * radius * (radius + height);
    }
    public double volume(){
        return PI * radius * radius * height;
    }
        
}
class CylinderDemo{

    public static void main(String[] args) {
        
        Cylinder c = new Cylinder(5, 10);

        System.out.println("Cylinder with Radius = 5 and Height = 10");
        System.out.println("Surface Area = " + c.area());
        System.out.println("Volume = " + c.volume());
    }
}
