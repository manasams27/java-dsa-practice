import java.util.*;
public class ReverseAnArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int a = 0;
        int b = n - 1;
        while(b > a){
            int c = arr[a];
            arr[a] = arr[b];
            arr[b] = c;
            a++;
            b--;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}