import java.util.Scanner;
class Seperateevenodd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Even elements: ");
        for(int i=0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.print("Odd elements: ");
        for(int i=0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
