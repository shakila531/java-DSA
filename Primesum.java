import java.util.Scanner;
class Primesum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int sum = 0;
        int count = 0;
        for(int i =2; i <= num; i++){
            for(int j = 1; j<=i ; j++){
                if(i%j ==0){
                    count++;
                }
            }
            if(count == 2){
                sum = sum + i;
            }
        }
        System.out.println("The sum of the"   +   num   +   "prime number is:" +   sum   );
    }
}