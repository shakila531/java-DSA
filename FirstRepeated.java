import java.util.Scanner;
class FirstRepeated{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String");
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            for(int j = i + 1; j < str.length(); j++){
                if(ch == str.charAt(j)){
                    System.out.println("First Repeated Character is: " + ch);
                    return;
                }
            }
        }

    }
}
