import java.util.Scanner;
import java.util.Stack;

public class HTMLTags {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        //String str = "";
        while(n-->0){
            Stack<Character> stk = new Stack<>();
            String str = "";
            int t = sc.nextInt();
            while(t-->0){
                if(sc.next().equals("<>"))
                    str+="{";
                else
                    str+="}";
            }
            if((str.length()&1)==1) {
                System.out.println("-1");
                continue;
            }

            for(int i = 0; i<str.length(); i++){
                char c = str.charAt(i);
                if (c =='}' && !stk.empty())
                {
                    if (stk.peek()=='{')
                        stk.pop();
                    else
                        stk.push(c);
                }
                else
                    stk.push(c);

            }
            int p = 0,  q = 0;
            while(!stk.isEmpty()){
                if(stk.pop()=='{') p++;
                else q++;
            }
            System.out.println((int)(Math.ceil((double)p/2)+Math.ceil((double)q/2)));

        }

    }
}
