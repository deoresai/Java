/* Define an abstract class Staff with protected members id and name. Define a 
parameterized constructor. Define one subclass OfficeStaff with member 
department. Create n objects of OfficeStaff and display all details. */

import java.util.Scanner;

abstract class Staff {
    protected int id;
    protected String name;

    Staff(int id,String name) {
        this.id=id;
        this.name=name;
    }
   abstract  void display();
    
}
class OfficeStaff extends Staff{
    String Dept;
    OfficeStaff(int id,String name,String Dept) {
        super(id,name);
        this.Dept=Dept;
    }
    void display(){        
        System.out.println("Department : "+Dept+" id :"+id+" name : "+name);
    }
    
}
class officeDemo{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n,i,id;
        String name,Dept;
        System.out.println("Count of office staff ?");
        n=sc.nextInt();
    
        OfficeStaff s[]=new OfficeStaff[n];
        for ( i = 0; i < n; i++) {
            System.out.println("Enter a id,name,department");
            id=sc.nextInt();
            name=sc.next();
            Dept=sc.next();
            s[i]=new OfficeStaff(id,name,Dept); 
        }
        for ( i = 0; i < n; i++) {
            s[i].display();
        }
    }
}
