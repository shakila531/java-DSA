import java.util.Scanner;
class Neonnum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int squere = num * num;
        int sum = 0;
        while(squere > 0){
            int rem = squere % 10;
            sum = sum + rem;
            squere = squere / 10;
        }
        if(sum == num){
            System.out.println("The number is neon number");
        }
        else{
            System.out.println("The number is not neon number");
        }
    }
}
