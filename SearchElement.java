import java.util.Scanner;

class SearchElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter the element to search: ");
        int search = sc.nextInt();

        int flag = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                flag = 1;
                System.out.println("Element found at index " + i);
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Element not found");
        
    }
}
