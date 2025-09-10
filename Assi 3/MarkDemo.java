

interface Marker{}
class product implements Marker{
    int p_id;
    String p_name;
    int p_cost;
    int p_quantity;

    public product() {
        p_id=0;
        p_name="name";
        p_cost=0;
        p_quantity=0;
    }
    public product(int p_id,String p_name,int p_cost,int p_quantity){
        this.p_id=p_id;
        this.p_name=p_name;
        this.p_cost=p_cost;
        this.p_quantity=p_quantity;
    }
    void display(){
        System.out.println("ID: "+p_id+" Name: "+p_name+" Cost: "+p_cost+" quantity: "+p_quantity);
    }
}
class MarkDemo{
    public static void main(String[] args) {
        product P1=new product();
        product P2=new product(1,"pen",10,10);
        product P3=new product(2,"pencile",10,10);
        product P4=new product(3,"mobile",1000,10);

        P1.display();
        P2.display();
        P3.display();
        P4.display();   
    }
}