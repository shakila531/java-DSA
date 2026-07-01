import java.util.Scanner;
class Countdigitalpspe{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int digitCount = 0;
        int alphabetCount = 0;
        int specialCharCount = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                digitCount++;
            } else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                alphabetCount++;
            } else {
                specialCharCount++;
            }
        }
        System.out.println("Digit count: " + digitCount);
        System.out.println("Alphabet count: " + alphabetCount);
        System.out.println("Special character count: " + specialCharCount);
    }
}