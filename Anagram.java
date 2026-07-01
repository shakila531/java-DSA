import java.util.Scanner;
class Anagram{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();    
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() != str2.length()){
            System.out.println("The strings are not anagrams.");
        }
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < str1.length(); i++){
            char ch = str1.charAt(i);
            for(int j = 0; j < str1.length(); j++){
                if(ch == str1.charAt(j)){
                    count1++;
                }
                if(ch == str2.charAt(j)){
                    count2++;
                }
            }
        }
        if(count1 != count2){
                System.out.println("The strings are not anagrams.");
        }
        else{
            System.out.println("The strings are anagrams.");
        }
    }
}
