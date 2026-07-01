import java.util.Scanner;
class Armstrong{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while(num > 0){
            int digit  = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;

        }
        if( temp == sum ){
            System.out.println("Armstrong number:");
        }
        else{
            System.out.println("not a armstrong number:");
        }

    }
}
