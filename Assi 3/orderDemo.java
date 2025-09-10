
import java.util.Scanner;

abstract class order{
    int id;
    String Dis;
    abstract void accept(Scanner sc);
    abstract void display();
}
class purchaseOrder extends order{
    String CN;
    public void accept(Scanner sc){
        
        System.out.println("Enter id");
        id= sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter Customer name");
        CN= sc.nextLine();
        System.out.println("Enter  description");
        Dis= sc.nextLine();
    }
    public void display(){
        System.out.println("ID: "+id+" customer: "+CN+" description: "+Dis);
    }
}
class salesOrder extends order{
    String CN,VN;
    public void accept(Scanner sc){
        
       
        System.out.println("Enter id");
        id= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter vender name");
        VN= sc.nextLine();
        System.out.println("Enter  description");
        Dis= sc.nextLine();
    
    }
    public void display(){
        System.out.println("ID: "+id+" customer: "+VN+" description: "+Dis);
    }
}
class orderDemo{
    public static void main(String[] args) {
        purchaseOrder PO[] =new purchaseOrder[3];
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details for perchase order");
        for (i = 0; i < 3; i++) {
            PO[i]=new purchaseOrder();
            PO[i].accept(sc);
        }
        salesOrder SO[] = new salesOrder[3];
        System.out.println("Enter details for sales order");
        for (i = 0; i < 3; i++) {
            SO[i]=new salesOrder();
            SO[i].accept(sc);
        }
        System.out.println("-----details of perchase order-----");
        for (i = 0; i < 3; i++) {
            PO[i].display();
        }
        System.out.println("-----details of sales order-----");
        for (i = 0; i < 3; i++) {
            SO[i].display();
        }

    }
}