interface  num{
    abstract int calculate();
}
class cube implements num{
    int n;
    cube(int n){
        this.n=n;
    }
    public int calculate(){
        return n*n*n;
    }
}
class cubeDemo{
    public static void main(String[] args) {
        cube c;
        c=new cube(2);
        System.out.println("cube is "+c.calculate());
    }
}