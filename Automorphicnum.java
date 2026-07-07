import java.util.Scanner;
class Automorphicnum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n * n;
        int temp = n;
        while(temp != 0){
            if(square % 10 != temp % 10){
                System.out.println("Not an Automorphic number");
                return;
            }
            square = square / 10;
            temp = temp / 10;

        }
        System.out.println("Automorphic number");
        
        
    }
}