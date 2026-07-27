//An Automorphic Number is an integer whose square ends with the same digit as the number itself.
import java.util.*;
public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = n * n;
        int temp = n;
        int divisor = 1;
        while(temp > 0){
            divisor = divisor * 10;
            temp = temp/10;
        }
        if(res % divisor == n){
            System.out.println("Automorphic Number");
        }else{
            System.out.println("Not a Automorphic Number");
        }
    }
}
