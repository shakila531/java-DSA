import java.util.ArrayList;
import java.util.Scanner;

class Arrayl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> cart = new ArrayList<>();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); // Clear newline

        System.out.println("Enter products:");
        for (int i = 0; i < n; i++) {
            String product = sc.nextLine();
            cart.add(product);
        }

        System.out.println("Cart: " + cart);

        System.out.print("Enter product to remove: ");
        String removeProduct = sc.nextLine();

        cart.remove(removeProduct);

        System.out.println("Cart after removing product: " + cart);
    }
}
