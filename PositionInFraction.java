import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PositionInFraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal a, b;
        a = sc.nextBigDecimal();
        b = sc.nextBigDecimal();
        BigDecimal res = new BigDecimal(1);
        int c = sc.nextInt();
        res = a.divide(b, 100005, RoundingMode.HALF_UP);
        String str;
        str = res.toString();
        int flag = -1;
        for(int i = 0; i<str.length()-1 ; i++){
            char tmp = str.charAt(i);
            if(tmp==((c)+'0')){
                System.out.println(i-1);
                flag = 0;
                break;

            }

        }
        if(flag==-1)
            System.out.println(flag);



    }
}
