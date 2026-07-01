import java.util.Scanner;
class Sumprime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        //boolean isprime = true;
        int sum = 0,count=0,num=2;
        while(count<n){
            boolean isprime = true;
            for(int i = 2; i <= num/2; i++){
                if(num % i == 0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                sum = sum + num;
                count++;
            }
            num++;
        }
        
        System.out.println("The sum of prime numbers is: " + sum);
    


    }
}
