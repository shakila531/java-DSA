import java.util.Scanner;
class RemovealpF{
    static void alpha(String str){
        int digit = 0;
        int alphabet = 0;
        int special = 0;
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch >='0' && ch <= '9'){
                digit++;
            }
            else if((ch>= 'a' && ch<= 'z' )|| (ch<= 'A'  && ch >= 'Z')){
                alphabet++;
            }
            else{
                special++;
            }
        }
        System.out.println("count of the digits"+ digit);
        System.out.println("count of the alphabets:"+alphabet);
        System.out.println("count of the specialcharacter:"+ special);

    }
        

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();

        alpha(str);
        
    }
}
