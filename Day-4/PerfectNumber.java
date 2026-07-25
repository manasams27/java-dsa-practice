import java.util.*;
public class PerfectNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        if(sum == original){
            System.out.println("Perfect number");
        }else{
            System.out.println("Not a Perfect Number");
        }
    }
}