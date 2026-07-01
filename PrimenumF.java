import java.util.Scanner;
class PrimenumF{
    int checkprime(int num){
        if(num <= 1){
            return 0;
        }
        for(int i = 2;i <= num / 2; i++){
            if(num % i == 0){
                return 0;
            }
        }
        return 1;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        PrimenumF obj = new PrimenumF();
        int result = obj.checkprime(num);
        if(result == 1){
            System.out.println(num+"is the prime number:");
        }
        else{
            System.out.println(num+"is not the prime number");
        }


    }
}