import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempt = 0;
        int secret = 27;
        while(true){
            int guess = sc.nextInt();
            if(guess==secret){
                System.out.println("Congratulations! You guessed it.");
                break;
            } else if(guess<secret){
                System.out.println("Too Low");
            } else{
                System.out.println("Too High");
            }
            attempt++;
            if(attempt==5){
                System.out.println("Better Luck Next Time!");
                break;
            }
        }
    }
}
