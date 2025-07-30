
import java.util.Scanner;

// Calculate the volume of cylinder. (hint : Volume: π × r² × h) 
// Find the factorial of given number. 
// Check the number is Armstrong or not. 
// Exit
class A1S1c { //add class name according to you

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, h, choice;
        final double PI = 3.14;

        do {
            System.out.println("1: calculate valume of Cylinder");
            System.out.println("2: Factorial");
            System.out.println("3: Armstrong");
            System.out.println("4: Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a radious and height of cylinder");
                    r = sc.nextInt();
                    h = sc.nextInt();
                    double volume = PI * r * r * h;
                    System.err.println("volume " + volume);
                    break;
                case 2:
                    int numm,facto = 1;
                    System.out.println("Enter a number");
                    numm = sc.nextInt();
                    for (int i = 1; i <= numm; i++) {
                        facto = facto * i;
                    }
                    System.out.println("Factorial is " + facto);
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    int arm = sc.nextInt();
                    int original = arm;
                    int sum = 0,
                     digit;
                    int n = String.valueOf(arm).length();

                    while (arm != 0) {
                        digit = arm % 10;
                        sum += Math.pow(digit, n);
                        arm /= 10;
                    }

                    if (sum == original) {
                        System.out.println(original + " is an Armstrong number."); 
                    }else {
                        System.out.println(original + " is not an Armstrong number.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        } while (choice != 4);
    }
}
