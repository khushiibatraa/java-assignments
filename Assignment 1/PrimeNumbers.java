import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for(int i=start; i<=end; i++){
            boolean isprime = true;
            if(i<2){
                continue;
            }
            for(int j=2; j*j<=i; j++){
                if(i%j==0){
                    isprime = false;
                    break;
                }

            }
            if(isprime)
                System.out.println(i);
        }
    }
    
}
