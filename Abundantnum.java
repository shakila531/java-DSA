import java.util.Scanner;
class Abundantnum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int temp = n;
        while(n != 0){
            if(n % 10 == 0){
                sum = sum + n%10;
            }   
            n = n/10;
        }
       if(sum > temp){
            System.out.println("Abundant number");
        }
        else{
            System.out.println("Not an abundant number");
        }
    }

}
