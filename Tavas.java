import java.util.Scanner;

public class Tavas {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        String str = sc.next();
        int pos = 1;
        long eq = 0;
        for(int i = str.length()-1; i>=0 ; i--){
            if(str.charAt(i)=='4')
                eq = eq+ eq<<pos;
            else
                eq = eq + (eq<<pos)+1;
            pos++;
        }
        System.out.println(eq+1);
    }
}
