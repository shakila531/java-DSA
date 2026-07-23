import java.util.Scanner;
class Sunnynum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num + 1;
        boolean sunny = false;
        for(int i =1; i <= n; i++){

            if(i * i == n){
                sunny = true;
                break;

            }
        }
        if(sunny){
            System.out.println("sunny num");
        }
        else{
            System.out.println("not a sunny num:");
        }
    }
}
