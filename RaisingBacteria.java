import java.util.Scanner;

public class RaisingBacteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int x = sc.nextInt();
        int c = 0;
        while(x!=1){
            System.out.println(x);
            if(x%2==1) {
                c++;
                x--;
            }
            x = x>>1;
            System.out.println(x+"f");
        }
        System.out.println(c+1);
    }
}
