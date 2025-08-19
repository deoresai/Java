package Fibo;
public class Fibo{

    public void printfibonscci(int n){
        int a=0,b=1;
        System.out.println("Fibonacci searies is ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a+" ");
            int next=a+b;
            a=b;
            b=next;

        }
    }

}
