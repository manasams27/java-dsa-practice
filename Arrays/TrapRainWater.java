import java.util.*;
public class TrapRainWater{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            int leftMax = arr[i];
            int rightMax = arr[i];
            for(int j=0; j<=i; j++){
                if(arr[j] > leftMax){
                    leftMax = arr[j];
                }
            }
            for(int j=i; j<n; j++){
                if(arr[j] > rightMax){
                    rightMax = arr[j];
                }
            }
            int water = Math.min(leftMax, rightMax) - arr[i];
            sum += water;
        }
        System.out.println(sum);
    }
}