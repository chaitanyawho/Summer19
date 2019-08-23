import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class GGMobile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            n = sc.nextInt();
            if(n==0)System.exit(0);
            ArrayList<Integer> a = new ArrayList<>(n);
            int arr[] = new int[n+1];
            arr[0] = 0;
            Stack<Integer> stk = new Stack<>();
            Stack<Integer> aux = new Stack<>();
            aux.push(0);
            for(int i = 0; i<n ;i++){
                int x = sc.nextInt();
                try {
                    if (!stk.isEmpty()) {
                        while (stk.peek() == aux.peek() + 1)
                            aux.push(stk.pop());
                    }
                }catch(Exception e){}
                if(x==aux.peek()+1) aux.push(x);
                else
                    stk.push(x);
            }
            try {
                if (!stk.isEmpty()) {
                    while (stk.peek() == aux.peek() + 1)
                        aux.push(stk.pop());
                }
            }catch(EmptyStackException e){}
            if(stk.isEmpty())
                System.out.println("yes");
            else System.out.println("no");
        }while(true);


    }
}
