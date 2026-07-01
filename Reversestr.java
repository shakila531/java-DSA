import java.util.Scanner;
class Reversestr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = sc.nextLine();
        System.out.println("The reverse of a string is:");
        for(int i = str.length()-1; i >= 0; i--){
            System.out.println(str.charAt(i));
        }
    }
}

