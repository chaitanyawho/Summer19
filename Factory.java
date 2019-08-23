import java.math.BigInteger;
import java.util.Scanner;

public class Factory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger x = sc.nextBigInteger();
        int m = sc.nextInt();
        BigInteger res;
        for(int i = 0 ; i<20 ;i++){
            res = x.multiply(BigInteger.valueOf((int)Math.pow(2.0, i)));
            if(res.mod(BigInteger.valueOf(m)).equals(BigInteger.valueOf(0))){
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");

    }
}
