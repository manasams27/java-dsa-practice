import java.util.*;
public class CountEvenOrOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int oddCount = 0;
        int evenCount = 0;
        for(int i=0; i<n; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println(oddCount);
        System.out.println(evenCount);
    }
    
}