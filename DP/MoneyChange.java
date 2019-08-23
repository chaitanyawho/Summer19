
import java.util.*;
public class MoneyChange {
    private static int getChange(int m) {
        int coin[] = {1, 3, 4};
        int T[][] = new int[3][m+1];
        T[0][0] = 0;
        T[1][0] = 0;
        T[2][0] = 0;
        for(int i = 0; i<3;i++){
            for(int j = 1; j<=m;j++){
                if(i==0){
                    T[i][j] = j;
                    continue;
                }
                if(j>=coin[i])
                    T[i][j] = Math.min(T[i-1][j], T[i][j-coin[i]]+1);
                else
                    T[i][j] = T[i-1][j];
            }
        }
        return T[2][m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}
