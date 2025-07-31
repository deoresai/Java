

import java.util.Scanner;

class matrix {//change class name according to you

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[10][10];
        int b[][] = new int[10][10];
        int c[][] = new int[10][10];
        int n, i, j, choice, k;
        System.out.println("Enter a number of Rows");
        n = sc.nextInt();
        System.out.println("Enter array");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        do {
            System.out.println("1: Addition");
            System.out.println("2: Multiplication");
            System.out.println("3: Traspose");
            System.out.println("4: Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter array");
                    for (i = 0; i < n; i++) {
                        for (j = 0; j < n; j++) {
                            b[i][j] = sc.nextInt();
                        }
                    }
                    System.out.println("Enter array");
                    for (i = 0; i < n; i++) {
                        for (j = 0; j < n; j++) {
                            c[i][j] = a[i][j] + b[i][j];
                        }
                    }
                    for (i = 0; i < n; i++) {
                        for (j = 0; j < n; j++) {
                            System.out.print(" " + c[i][j]);
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Enter array");
                    for (i = 0; i < n; i++) {
                        for (j = 0; j < n; j++) {
                            b[i][j] = sc.nextInt();
                        }
                    }
                    for (i = 0; i < n; i++) {
                        for (j = 0; j < n; j++) {
                            c[i][j] = 0;  
                            for (k = 0; k < n; k++) {
                                c[i][j] += a[i][k] * b[k][j];
                            }
                        }
                    }

                    for (i = 0; i < n; i++) {
                        for (j = 0; j < n; j++) {
                            System.out.print(" " + c[i][j]);
                        }
                        System.out.println("");
                    }
                    break;

                case 3:
                    for (i = 0; i < n; i++) {
                        for (j = 0; j < n; j++) {
                            System.out.print(" " + a[j][i]);
                        }
                        System.out.println("");
                    }
                    break;

                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

        } while (choice != 5);

    }
}
