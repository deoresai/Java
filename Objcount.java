
import java.util.Scanner;

class Employee{
    int id;
    String name;
    String deptname;
    Double salary;
    static int count=0;
    Employee(int id,String name,String deptname,Double salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.deptname=deptname;
        this.count++;
    }
    public int getcount(){
        return count;
    }
     public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + deptname + ", Salary: " + salary);
    }
}
class Employeedemo{

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int id,j=1;
            String name;
            String deptname;
            Double salary;
            Employee e1 =new Employee(1, "hemu", "computer", 89000.0);
            e1.display();
            Employee e2 =new Employee(2, "manish", "Stat", 85000.0);
            e2.display();
            Employee e3 =new Employee(3, "Tahib", "computer", 90000.0);
            e3.display();
            Employee e4 =new Employee(4, "yogesh", "computer", 85000.0);
            e4.display();
            System.out.println("Count is "+e4.getcount());
      }
}
