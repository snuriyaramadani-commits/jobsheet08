import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int sum = 0;

            System.out.print("n = " + i + " -> sum of squares = ");

            for (int j = 1; j <= i; j++) {
                sum += j * j;

                System.out.print(j * j);

                if (j < i) {
                    System.out.print(" + ");
                }
            }

            System.out.println(" = " + sum);
        }

        sc.close();
    }
}