//Jasser Gerardo Cedeno Cerezo
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Reading the number of entries
        int k = sc.nextInt(); // Reading the maximum size of the leaderboard table

        Player[] players = new Player[n]; // Creating an array of players

        for (int i = 0; i < n; i++) {
            String name = sc.next(); // Reading the player's name
            int score = sc.nextInt(); // Reading the player's score
            players[i] = new Player(name, score); // Creating a Player object and adding it to the array
        }

        sc.close(); // Closing the Scanner object

        Arrays.sort(players); // Sorting players based on their scores

        // Writing the first K players in the leaderboard table to the standard output
        for (int i = 0; i < k && i < n; i++) {
            System.out.println(players[i].getName() + " " + players[i].getScore());
        }
    }
}

class Player implements Comparable<Player> {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Player other) {
        return Integer.compare(other.score, this.score); // Sorting in descending order based on score
    }
}
