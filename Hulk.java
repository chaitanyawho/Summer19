
import java.util.*;

public class Hulk {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = {"I hate", "I love"};
        String it = "it";
        String that = "that ";
        int s = 0;
        while(n>1){
            System.out.print(str[s]+" "+that);
            s ^= 1;
            n--;
        }
        System.out.print(str[s]+" "+it);

    }

}
