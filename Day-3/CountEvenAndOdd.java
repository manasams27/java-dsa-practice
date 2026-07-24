import java.util.*;
public class CountEvenAndOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddCount = 0;
        int evenCount = 0;
        while(n > 0){
            int digit = n % 10;
            if(digit % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
            n = n / 10;
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
    }
}
