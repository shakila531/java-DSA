import java.util.Scanner;
class Friendlypair{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        int sum1 =0;
        int sum2 = 0;
        for(int i = 1; i <= num1; i++){
            if(num1 %i== 0){
                sum1 = sum1 + i;


            }
        }
        int no1 = sum1 / num1;
        for(int j = 1; j <= num2; j++){
            if(num2 %j== 0){
                sum2 = sum2 + j;
            }
        }
        int no2 = sum2 / num2;
        if(no1 == no2){
            System.out.println("The numbers are friendly pair");
        }
        else{
            System.out.println("The numbers are not friendly pair");
        }

    }
}
