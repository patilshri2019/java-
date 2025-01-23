
import java.util.Scanner;

public class factorial {
    public static void facto(int n){
        int fact = 1;
        for(int i = n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        System.out.println("Enter A number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        facto(n);

    }
}
