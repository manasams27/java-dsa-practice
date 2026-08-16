import java.util.*;
public class MaxDiffOf2Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int sub = 0;
                sub = arr[j] - arr[i];
                if(sub > max){
                    max = sub;
                }
            }
        }
        System.out.println(max);
    }
}
