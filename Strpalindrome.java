import java.util.Scanner;
class Strpalindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = sc.nextLine();
        String rev = "";
        System.out.println("The reverse of a string is:");
        for(int i = str.length()-1; i >= 0; i--){
            System.out.println(str.charAt(i));
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("The string is palindrome");
        }
        else{
            System.out.println("The string is not palindrome");
        }
    }
}
