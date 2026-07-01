import java.util.Scanner;
class Guessnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the secret number: ");
        int secretnumber = sc.nextInt();
        int tries = 0;
        while(true) {
            System.out.println("Guess the number: ");
            int num = sc.nextInt();
            if(secretnumber >  num){
                System.out.println("The secret number is greater than your guess.");
                tries++;
                
            }
            else if(secretnumber < num){
                System.out.println("The secret number is less than your guess.");
                tries++;
            }
            else if(secretnumber == num){
                System.out.println("You guessed the secret number in " + tries + " tries.");
                break;
            }

        }


    }
}
