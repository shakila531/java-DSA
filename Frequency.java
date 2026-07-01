import java.util.Scanner;
class Frequency{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = sc.nextLine();
        int count =0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            for(int j = 0; j < str.length(); j++){
                if(ch == str.charAt(j)){
                    count++;
                }
            }
            System.out.println("Frequency of " + ch + " is: " + count);
        }

    }
}
