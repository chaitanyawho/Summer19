import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Arrays.asList;

//Class name has to be Main.
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        while(q-->0){
            int n = sc.nextInt();
            ArrayList<Integer> k = new ArrayList<>(n);
            ArrayList<Integer> p = new ArrayList<>(n);
            for(int i = 0; i<n;i++)
                k.add(sc.nextInt());
            for(int i = 0; i<n;i++)
                p.add(sc.nextInt());
            Collections.sort(k);
            Collections.sort(p);
            for(int i = 0; i<n;i++){
                k.set(i, k.get(i)-Math.min(k.get(i), p.get(i)));
                p.set(i, k.get(i)-Math.min(k.get(i), p.get(i)));
            }
            int sk = 0, pk = 0;
            for(int i = 0; i<n ;i++) {
                sk += k.get(i);
                pk += p.get(i);
            }
            if(sk==pk&&(Collections.frequency(k, 0)==Collections.frequency(p, 0)))
                System.out.println("Global Warming");
            else if(Collections.frequency(k, 0)>Collections.frequency(p, 0)){
                System.out.println("Parshites");
            }
            else
                System.out.println("Kashites");

        }

    }
}