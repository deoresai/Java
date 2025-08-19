package prime;
public class prime{
	public void doprime(int n) {
			int i;
			System.out.println("Series of Prime number");
			for (i = 2; i <= n; i++) {
				boolean isprime=true;
				for (int j = 2; j <= i/2; j++) {
					if(i%j==0){
							isprime=false;
							break;
					}
				}
				if(isprime==true){

					System.out.print(i+" ");
				}

			}
	}

}
