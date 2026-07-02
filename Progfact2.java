import java.util.Scanner;
class Progfact2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int fact = 1;
        int power = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
            power = power * x;
        }
        double result =(double) power / fact;
        System.out.println(result);
    }
}
