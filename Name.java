
import java.util.Scanner;

class Name{
    public static void main(String[] args) {
        String first,middle,last;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        first=sc.nextLine();
        middle=sc.nextLine();
        last=sc.nextLine();
        middle=middle.toUpperCase().charAt(0)+middle.substring(1);

        System.out.println(last+" "+first+" "+middle);

    }
}
