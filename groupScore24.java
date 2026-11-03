import java.util.Scanner;

public class groupScore24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score;
        int totalScore;
        double avgScore;

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

            System.out.println("Total Score: " + totalScore);
            System.out.println("Average Score: " + avgScore);

            System.out.println();

            i++;
        }

        sc.close();
    }
}