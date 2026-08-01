import java.util.Scanner;
public class SmallestArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int curr = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < curr){
                curr = arr[i];
            }
        }
        System.out.println(curr);
    }
}
