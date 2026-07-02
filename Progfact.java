import java.util.Scanner;
class Progfact{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        double result = 1.0 / fact;
        System.out.println(result);

        
    }
}
