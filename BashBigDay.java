import java.util.ArrayList;
import java.util.Scanner;

public class BashBigDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> s = new ArrayList<>(n);
        for(int i = 0; i< n; i++){
            s.add(sc.nextInt());
        }
        int current = s.get(0);
        int k = 0;
        ArrayList<Integer> ct = new ArrayList<>();
        for(int i : s){
            if(!isPrime(i))
                ct.add(i);
        }
        while(!s.isEmpty()){

            if(gcd(current, s.get(k))!=1)
                ct.add(s.get(k));
        }

    }
    static int gcd(int a, int b){
        if(a==0)
            return b;
        return gcd(b%a, a);
    }
    static boolean isPrime(int a){
        for(int i = 2 ; i<a ; i++){
            if(a%i==0)
                return false;
        }
        return true;
    }
}
