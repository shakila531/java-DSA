import java.util.Scanner;
class Countdigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        for(int i =1; i <= n; i++){
            if(temp ==0){
                break;
            }
            count++;
            temp = temp / 10;
        }
        System.out.println(count);
    }
}