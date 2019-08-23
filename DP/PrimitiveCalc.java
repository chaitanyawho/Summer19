
import java.util.*;
public class PrimitiveCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int num[] = new int[n+1];
        num[0] = 0; num[1] = 0;
        for(int i = 2; i<n+1;i++){
            int t1 = num[i-1]+1;
            int t2 = (i%2==0)? num[i/2]+1:n;
            int t3 = (i%3==0)? num[i/3]+1:n;
            num[i] = Math.min(Math.min(t1, t2), Math.min(t2, t3));
         }
        System.out.println(num[n]);
        ArrayList<Integer> seq = new ArrayList<>();
        seq.add(n);
        while(n!=1){
            if(n%3==0&&num[n]-1==num[n/3]){
                seq.add(n/3);
                n = n/3;
            }
            else if(n%2==0&&num[n]-1==num[n/2]){
                seq.add(n/2);
                n= n/2;
            }
            else {
                seq.add(n - 1);
                n = n - 1;
            }
        }
        Collections.reverse(seq);
        for(Integer i : seq){
            System.out.print(i+" ");
        }
    }
}
