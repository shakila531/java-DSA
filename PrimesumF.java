import java.util.Scanner;
class PrimesumF{
    int isprime(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++){
            int count=0;
            for(int j = 1;j <= i; j++){
                if( i % j == 0){
                    count++;
                }
            }
            if(count == 2){
                sum = sum+i;
            }
        }
        return sum;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        PrimesumF obj = new PrimesumF();
        int result = obj.isprime(num);
        System.out.println("The sum of prime no is:"+ result);
        

    }
}
