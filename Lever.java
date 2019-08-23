import java.util.Scanner;

public class Lever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String config = sc.next();
        String[] side = config.split("\\^");
        side[0] = side[0].replace('=', '0');
        side[1] = side[1].replace('=', '0');
        int l = side[0].length(), r = 1;
        int lhs = 0, rhs = 0;
        for(char c : side[0].toCharArray()){
            lhs+=Character.getNumericValue(c)*l--;
        }
        for(char c : side[1].toCharArray()){
            System.out.println(c+"   "+rhs);
            rhs+=Character.getNumericValue(c)*r++;
        }
        System.out.println(lhs+"["+side[0]+"]  ^  ["+side[1]+"]"+rhs);
        if(lhs>rhs)
            System.out.println("left");
        else if(lhs<rhs)
            System.out.println("right");
        else
            System.out.println("BAlanced");

    }
}
