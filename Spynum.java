import java.util.Scanner;
class Spynum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int product = 1;
        while(num > 0){
            int digit = num % 10;
            sum = sum + digit;
            product =product * digit;
            num = num / 10;
        }
        if(sum == product){
            System.out.println("The number is spy number");
        }
        else{
            System.out.println("The number is not spy number");
        }
    }
}
