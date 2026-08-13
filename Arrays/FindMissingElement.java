import java.util.*;
public class FindMissingElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int totalSum = n * (n + 1)/2;
        int arrSum = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            arrSum += arr[i];
        }
        int res = totalSum - arrSum;
        System.out.println(res);
    }
}