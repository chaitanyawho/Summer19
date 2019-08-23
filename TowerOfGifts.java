import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class TowerOfGifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stk = new Stack<>();
        Stack<Integer> aux = new Stack<>();
        stk.push(n+1);
        String op = "";
        while(n-->0){


            int x = sc.nextInt();

                if (!aux.isEmpty()) {
                    try {
                        while (aux.peek() + 1 == stk.peek()) {
                            stk.push(aux.pop());
                            op += stk.peek()+" ";
                        }
                    }catch(Exception e){}
                    //op+="\n";
                }
            //newday
            if(stk.peek()==x+1){
                stk.push(x);
                op+=stk.peek()+" ";}
            else{
                aux.push(x);
                Collections.sort(aux);
                op+="\n";
            }
        }


            if (!aux.isEmpty()) {
                try {
                    while (aux.peek() + 1 == stk.peek()) {
                        //System.out.println(aux + " '" + stk);
                        stk.push(aux.pop());
                        op = op + stk.peek().toString() + " ";
                        //System.out.println(aux + " '" + stk);
                    }
                }catch(Exception e){}
            }
        System.out.println(op);




    }
}
