import java.util.Scanner;
class Removeduplicate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array after removing duplicates: ");
        for(int i=0; i < arr.length; i++){
            boolean isduplicate = false;
            for(int j=i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    isduplicate = true;
                    break;
                }
            }
            if(isduplicate == false){
                System.out.print(arr[i]+" ");
            }
        }
    }
 
}
