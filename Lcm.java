import java.util.Scanner;
class Lcm{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x =a;
        int y = b;
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        int lcm = (x*y) / a;
        System.out.println(lcm);
    }
}
