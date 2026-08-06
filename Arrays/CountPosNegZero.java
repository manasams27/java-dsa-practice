import java.util.*;
public class CountPosNegZero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                posCount++;
            }else if(arr[i] < 0){
                negCount++;
            }else{
                zeroCount++;
            }
        }
        System.out.println(posCount);
        System.out.println(negCount);
        System.out.println(zeroCount);
    }
}