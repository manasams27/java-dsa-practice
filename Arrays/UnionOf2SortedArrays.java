import java.util.*;
public class UnionOf2SortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            arr2[i] = sc.nextInt();
        }
        int i=0, j=0;
        while(i<n && j<n){
            if(arr1[i] < arr2[j]){
                System.out.println(arr1[i]);
                i++;
            }
            else if(arr1[i] > arr2[j]){
                System.out.println(arr2[j]);
                j++;
            }
            else{
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }
        while(i < n){
            System.out.println(arr1[i]);
            i++;
        }
        while(j < n){
            System.out.println(arr2[j]);
            j++;
        }
    }
}
