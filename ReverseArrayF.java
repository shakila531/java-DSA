import java.util.Scanner;
public class ReverseArrayF {
    static void reverse(int[] arr){
        System.out.println("Reversed Array");
        for(int i =arr.length-1; i >= 0; i--){
            System.out.println(arr[i]+" ");
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array:");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        reverse(arr);


    }
    
}
