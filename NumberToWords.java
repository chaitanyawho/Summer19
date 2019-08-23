import java.io.*;
import java.util.*;
public class NumberToWords {
    static String[] ones = {"", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine "};
    static String[] ptens = {"", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
    static String[] tens = {"", "Ten ", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
    static String[] higher = {"", "Thousand ", "Million ", "Billion ", "Trillion "};
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<String> n = new ArrayList<>(t);
        for(int i = 0;i<t;i++)
            n.add(sc.next());
        for(String num : n){
            Stack<String> stk = new Stack<>();
            if(num.equals("0")){
                System.out.println("Zero");
                continue;
            }
            long cur = Long.parseLong(num);
            long td;
            int k = 0;
            while(cur>0){
                td = cur%1000;
                cur/=1000;
                stk.push(div(""+td)+((td!=0)?higher[k]:""));
                k++;
            }
            while(!stk.isEmpty())
                System.out.print(stk.pop());
            System.out.println();
        }
    }
    static String div(String str){
        int s = Integer.parseInt(str);
        String op = "";
        int d, di;
        di = s%10;
        op = ones[di];
        s/=10;
        d = s%10;
        op = (di!=0&&d==1)?ptens[di]:tens[d]+op;
        s/=10;
        if(s%10!=0) op = ones[s%10]+"Hundred "+op;
        return op;
    }
}

