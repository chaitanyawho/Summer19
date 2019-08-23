import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Mehrdad742B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n);
        for(int i = 0; i<n ;i++)
            a.add(sc.nextInt());
        int c = 0;
        for(Integer i : a){
            Integer temp = i;

            if(a.contains(i^x)) c++;

        }
        System.out.println(c/2);

    }
}
