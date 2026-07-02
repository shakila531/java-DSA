import java.util.Scanner;
class Sumofdigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        int num = sc.nextInt();
        int sum =0;
        for(int i =1; i <= num; i++){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("Sum of digits numbers:"+ sum);
    }
}
