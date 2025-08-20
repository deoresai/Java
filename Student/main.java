
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int n,rollNo,ct,mt,et,th,pr;
        String name;
        System.out.println("How many students do you want to enter?");
        n=sc.nextInt();
        student s[]=new student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Name of student " + i + ": ");
            name = sc.next();
            System.out.println("Roll no of student " + i + ": ");
            rollNo = sc.nextInt();
            System.out.println("computer marks of student " + i + ": ");
            ct = sc.nextInt();
            System.out.println("Math marks of student " + i + ": ");
            mt = sc.nextInt();
            System.out.println("electronics marks of student " + i + ": ");
            et = sc.nextInt();
            System.out.println("theory marks of student " + i + ": ");
            th = sc.nextInt();
            System.out.println("Practical marks of student " + i + ": ");
            pr = sc.nextInt();
            s[i]=new student(name,rollNo,ct,mt,et,th,pr);
        }
        for(int i = 0; i < n; i++) {
        s[i].display();
    }
    }

}