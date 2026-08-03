import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        boolean found = false;
        int[][] arr = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(arr[i][j] == x){
                    System.out.println("Element found at location(" + i + " , " + j + ")");
                    found = true;
                }
            }
        }
        if(found == false){
            System.out.println("element not found");
        }
    }
}
