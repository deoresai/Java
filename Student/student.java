
import SY.SYmarks;
import TY.TYmarks;

public class student {

    String name;
    int rollNo;
    SYmarks S;
    TYmarks T;
    double total=0;
   public  student(String name, int rollNo, int ct, int mt, int et, int th, int pr) {
        this.name = name;
        this.rollNo = rollNo;
        S = new SYmarks(ct, mt, et);
        T = new TYmarks(th, pr);
        total= ct + pr + th;
    }

    public void display() {
        String gread;
        double marks;
        marks = (total / 1500)*100;
        if (marks >= 70) {
            gread = "A";
        } else if (marks >= 60) {
            gread = "B";
        } else if (marks >= 50) {
            gread = "C";
        } else {
            gread = "Fail";
        }
        System.out.println("Name" + name + " Roll No: " + rollNo + " Marks: " + marks + " Gread: " + gread);
    }
}
