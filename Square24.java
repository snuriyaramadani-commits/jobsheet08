import java.util.Scanner;

public class Square24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for (int iOuter = 1; iOuter <= n; iOuter++)
                ;
            for (int iInner = 1; iInner <= n; iInner++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}