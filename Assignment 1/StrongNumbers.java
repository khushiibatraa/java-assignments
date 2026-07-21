import java.util.Scanner;

public class StrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for(int i=start; i<=end; i++){
            int sum = 0;
            int temp = i;
            while(temp>0){
                sum+=fact(temp%10);
                temp/=10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }

    static int fact(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
    
}
