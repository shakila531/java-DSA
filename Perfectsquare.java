import java.util.Scanner;
class Perfectsquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i;

        for (i = 1; i * i <= n; i++) {
            if (i * i == n) {
                System.out.println("Perfect Square Number");
                return;
            }
        }

        System.out.println("Not a Perfect Square Number");
    }
}