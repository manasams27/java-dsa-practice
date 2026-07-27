//A Number is Neon Number if the sum of the digits of its square equal to the number.
import java.util.*;
public class NeonNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int res = n*n;
        int sum = 0;
        while(res > 0){
            int digit = res%10;
            sum += digit;
            res = res/10;  
        }
        if(original == sum){
            System.out.println("Neon Number");
        }else{
            System.out.println("Not Neon Number");
        }
    }
}