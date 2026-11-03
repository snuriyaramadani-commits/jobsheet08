import java.util.Scanner;

public class groupScore24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score;
        int totalScore;
        double avgScore;

        double highestAverage = -1;
        int highestGroup = 0;

        int i = 1;

        while (i <= 6) {
            System.out.println("Group " + i);

            totalScore = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("Enter score from Rater Group "
                        + j + ": ");
                score = sc.nextInt();

                totalScore += score;
            }

            avgScore = (double) totalScore / 5;

            System.out.println("Average Score: " + avgScore);

            if (avgScore > highestAverage) {
                highestAverage = avgScore;
                highestGroup = i;
            }

            i++;
        }

        System.out.println("Group with the highest average: "
                + highestGroup);
        System.out.println("Highest Average Score: "
                + highestAverage);

        sc.close();
    }
}