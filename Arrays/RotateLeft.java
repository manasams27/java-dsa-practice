import java.util.*;
public class RotateLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];
        for(int i=0; i<n-1; i++){
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
        for(int k=0; k<n ;k++){
            System.out.println(arr[k]);
        }
    }
}
