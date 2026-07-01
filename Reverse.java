import java.util.Scanner;
class Reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the num:");
        int num = sc.nextInt();
        int rev =0;
        for(int i =0; i <= num; i++){
            int digit = num %10;
            rev =  rev * 10 +digit;
            num =num /10;

        }
        System.out.println("Reversed number:"+ rev);


    }
}
