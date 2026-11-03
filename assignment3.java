import java.util.Scanner;

public class assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of cafe branches: ");
        int branches = sc.nextInt();

        int grandTotalCustomers = 0;
        int grandTotalItems = 0;

        System.out.println("\n=== Sales Input Per Branch ===");

        for (int i = 1; i <= branches; i++) {
            System.out.println("\n--- Branch " + i + " ---");

            System.out.print("Number of customers: ");
            int customers = sc.nextInt();

            int totalItems = 0;

            for (int j = 1; j <= customers; j++) {
                System.out.print("- How many items did customer "
                        + j + " order? ");

                int items = sc.nextInt();

                totalItems += items;
            }

            System.out.println("Branch " + i + ":");
            System.out.println("- Customers: " + customers);
            System.out.println("- Items sold: " + totalItems);

            grandTotalCustomers += customers;
            grandTotalItems += totalItems;
        }

        System.out.println("\n=== Grand Total ===");
        System.out.println("- Customers: " + grandTotalCustomers);
        System.out.println("- Items sold: " + grandTotalItems);

        sc.close();
    }
}