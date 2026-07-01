import java.util.Scanner;

class ArrayeleF {

     int sortArray(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {

            for(int j = 0; j < arr.length - i - 1; j++) {

                if(arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[arr.length-1];
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayeleF obj = new ArrayeleF();

        int result =obj.sortArray(arr);

        System.out.println("Sorted Array:");

        for(int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.print(" \n");
        System.out.print("The largest element is:"+result);
    }
}
