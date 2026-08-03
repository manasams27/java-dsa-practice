import java.util.*;
public class CountEvenOrOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
            
        }
        int oddCount = 0;
        int evenCount = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(arr[i][j] % 2 == 0){
                    evenCount++;
                }else{
                    oddCount++;
                }
            }
        }
        System.out.println(oddCount);
        System.out.println(evenCount);
    }
    
}