import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class KethDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> div1 = new ArrayList<>();
        for(int i = 1; i<=Math.sqrt(n) ; i++){
            if (n%i==0) {
                div1.add(i);
                div1.add(n/i);
            }
        }
        Collections.sort(div1);
        try{
            System.out.println(div1.get(k-1));
        }catch(IndexOutOfBoundsException e){
            System.out.println("-1");
        }
    }
}
