

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> seq = new ArrayList<>(Collections.nCopies(n, 0));
        int a[] = new int[n];
        for(int i = 0; i<n;i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int b[] = new int[m];
        for(int i = 0;i<m;i++){
            b[i] = sc.nextInt();
        }
        int T[][] = new int[n+1][m+1];
        for(int i = 1;i<n+1;i++){
            for(int j = 1; j<m+1;j++){
                if(a[i-1]==b[j-1]){
                    T[i][j] = T[i-1][j-1]+1;
                }
                else
                    T[i][j] = Math.max(T[i-1][j], T[i][j-1]);
            }
        }
        System.out.println(T[n][m]);

    }
}
