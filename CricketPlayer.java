
import java.io.IOException;
import java.util.Scanner;

class PlayerInfo {

    String name;
    int no_of_innings;
    int no_of_times_notout;
    int totalruns;
    double bat_avg;

    PlayerInfo(String name, int no_of_innings, int no_of_times_notout, int totalruns) {
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_of_times_notout = no_of_times_notout;
        this.totalruns = totalruns;
    }

    void display() {
        System.out.println("name: " + name);
        System.out.println("No of innings: " + no_of_innings);
        System.out.println("No of times notout: " + no_of_times_notout);
        System.out.println("Total runs: " + totalruns);
        System.out.println("Batting avg: " + bat_avg);
    }
}

public class CricketPlayer {

    static void avg(PlayerInfo p[], int n) {
        for (int i = 0; i < n; i++) {
            p[i].bat_avg = (double) (p[i].totalruns / (p[i].no_of_innings
                    - p[i].no_of_times_notout));
        }
    }

    static void sort(PlayerInfo p[], int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (p[j].bat_avg > p[j + 1].bat_avg) {
                    PlayerInfo temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String name;
        int no_of_innings;
        int no_of_times_notout;
        int totalruns;
        double bat_avg;

        Scanner sc = new Scanner(System.in);
        System.out.println("how many players");
        int n = sc.nextInt();
        PlayerInfo p[] = new PlayerInfo[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("enter name , no of innings, no of times notnot , totalruns of batter no"+(i+1));
            name = sc.nextLine();
            no_of_innings = sc.nextInt();
            no_of_times_notout = sc.nextInt();
            totalruns = sc.nextInt();
            p[i] = new PlayerInfo(name, no_of_innings, no_of_times_notout, totalruns);
        }
        avg(p, n);
        sort(p, n);

        for (PlayerInfo i : p) {
            i.display();
            System.out.println();
        }
    }

 }
