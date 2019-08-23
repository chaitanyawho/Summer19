import java.io.*;
import java.util.*;

import static javax.swing.UIManager.put;

public class RomanNumerals {

    //static Map<Integer, Character> nr = Map.of(1, 'I', 5, 'V', 10, 'X', 50, 'L', 100, 'C', 500, 'D', 1000, 'M');
    static Map<Character, Integer> rn = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500,'M', 1000);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //first we find out the number represented by the i/p
        Scanner sc = new Scanner((System.in));
        int t = sc.nextInt();
        ArrayList<String> ip = new ArrayList<>(t);
        Map<Integer, Character> nr = Map.of(1, 'I', 5, 'V', 10, 'X', 50, 'L', 100, 'C', 500, 'D', 1000, 'M');
        for(int i = 0 ; i<t ; i++)
            ip.add(sc.next());
        int x;
        int[] des = {1000, 500, 100, 50, 10, 5, 1};
        for(String i : ip) {
            x = getValue(i);
            int[] f = {0, 0, 0, 0, 0, 0, 0};

            for (int k = 0; k < 7; k++)
                while (x >= des[k]) {
                    f[k]++;
                    x = x - des[k];
                }

            String res = "";
            while(f[0]-->0)
                res+=nr.get(des[0]);

            if(f[2]==4){
                if(f[1]==1){
                    res = res+"CM";
                    f[1]--;

                }
                else{
                    res = res+"CD";
                }
                f[2]=0;
            }
            while(f[1]-->0)
                res+=nr.get(des[1]);


            while(f[2]-->0)
                res+=nr.get(des[2]);
            if(f[4]==4){
                if(f[3]==1){
                    res = res+"XC";
                    f[3]--;
                }
                else{
                    res = res+"XL";
                }
                f[4]=0;
            }
            while(f[3]-->0)
                res+=nr.get(des[3]);
            while(f[4]-->0)
                res+=nr.get(des[4]);
            if(f[6]==4){
                if(f[5]==1){
                    res+= "IX";
                    f[5]--;
                }
                else{
                    res+= "IV";
                }
                f[6] = 0;
            }
            while(f[5]-->0)
                res+=nr.get(des[5]);
            while(f[6]-->0)
                res+=nr.get(des[6]);
            System.out.println(res);
        }
    }
    public static int getValue(String str){
        int sum = 0;
        for(char c : str.toCharArray()){
            sum+=rn.get(c);
        }
        return sum;
    }
}

