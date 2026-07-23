import java.util.Scanner;
class Happynum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num != 1 && num != 4){
            int sum = 0;  
            while(num > 0){
                int digit = num % 10;
                sum = sum + digit * digit;
                num = num / 10;
            }
            num = sum;
        }          
        if(num == 1){
            System.out.println("Happy num:");
        }
        else{
            System.out.println("not a happy number:");
        }
    }
}
