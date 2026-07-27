//A Number is a SPY number if sum of digits = product of digit.
import java.util.*;
public class SpyNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int mul = 1;
        while(n > 0){
            int digit = n % 10;
            sum += digit;
            mul = mul * digit;
            n = n / 10;

        }
        if(sum == mul){
            System.out.println("Spy Number");
        }else{
            System.out.println("Not a Spy Number");
        }
    }
}