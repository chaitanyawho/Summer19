

import java.util.Scanner;

public class EditDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int[][] T = new int[str1.length()+1][str2.length()+1];
        char a[] = str1.toCharArray();
        char b[] = str2.toCharArray();
        if(a[0]==b[0])
            T[0][0]=0;
        for(int i = 0; i< str1.length()+1;i++){
            for(int j = 0; j< str2.length()+1;j++) {
                if (i == 0 || j == 0) {
                    if (i == 0)
                        T[i][j] = j;
                    else if (j == 0)
                        T[i][j] = i;
                    continue;
                }
                if (a[i-1] == b[j-1])
                    T[i][j] = T[i-1][j-1];
                else
                    T[i][j] = 1 + Math.min(Math.min(T[i - 1][j], T[i][j - 1]), T[i - 1][j - 1]);
            }

        }

        System.out.println(T[a.length][b.length]);
    }
}
