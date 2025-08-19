import java.util.Scanner;
import prime.prime;
import square.square;
import Fibo.Fibo;

class main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter value of N");
			 int n=sc.nextInt();

			prime p =new prime();
				p.doprime(n);
			System.out.println(" ");
			square s = new square();
				s.dosquare(n);
			System.out.println(" ");
            Fibo F = new Fibo();
                F.printfibonscci(n);

	}
}