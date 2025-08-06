import java.util.*;
class Student{
    int roll_no;
    String name;
    double per;

    Student(int roll_no, String name,double percentage){
        this.roll_no=roll_no;
        this.name=name;
        this.per=percentage;
    }
    static void sort(Student[] Stuarr,int n){
        Student temp;
        for (int i = 0; i < n; i++) {
            for (int j =i+1 ; j < n; j++) {
                if (Stuarr[i].per > Stuarr[j].per) {
                    temp=Stuarr[i];
                    Stuarr[i]=Stuarr[j];
                    Stuarr[j]=temp;
                }
            }
        }
    }
    public void display(){
        System.out.println("name: "+name+"\troll number: "+roll_no+"\t percentage: "+per);

    }
}
class A2Ab{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        System.err.println("How many students are there");
        n=sc.nextInt();
        Student[] Stuarr =new Student[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter name , rollnumber , percentsgee");
            String name=sc.next();
            int roll_no=sc.nextInt();
            Double per =sc.nextDouble();

            Stuarr[i]=new Student(roll_no, name, per);
        }
        Student.sort(Stuarr,n);
        for (int i = 0; i < n; i++) {
            Stuarr[i].display();
            System.out.print("\n");
        }
    }
}
