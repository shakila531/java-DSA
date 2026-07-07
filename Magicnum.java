import java.util.Scanner;
class Magicnum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            sum = sum + digit;
            n = n/10;
        }
         n = sum;
        if(n == 1){
            System.out.println("Magic number");
        }
        else{
            System.out.println("Not a magic number");
        }
    }
}
