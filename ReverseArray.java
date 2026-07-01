import java.util.Scanner;
class ReverseArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Reversed array: ");
        for(int i = arr.length -1; i >= 0;i--){
            System.out.println(arr[i]+" ");
        }
        
    }
}

