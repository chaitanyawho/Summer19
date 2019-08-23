import javafx.collections.ArrayChangeListener;

import java.util.*;

public class Hakuna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Qnode> ip = new Stack<>();
        Deque<Qnode> q = new LinkedList<>();
        Qnode temp;
        int c, r;
        for(int i = 0; i<n ;i++){
            if(sc.next().equals("E")){
                if(q.isEmpty())
                    q.addLast(new Qnode(sc.nextInt(), sc.nextInt()));
                else {
                    c = sc.nextInt();
                    r = sc.nextInt();

                    try {
                        boolean flag = false;
                        for(Qnode j : q){
                            if(j.cid==c)
                                flag = true;
                        }
                        while ((q.peekLast().cid != c)&&flag) {
                            ip.push(q.removeLast());
                        }
                    }catch(Exception e){
                        System.out.println(e);

                    }
                    q.addLast(new Qnode(c, r));
                    while (!ip.isEmpty())
                        q.addLast(ip.pop());
                }
            }
            else
                System.out.println(q.removeFirst());
        }

    }
    static class Qnode{
        int cid;
        int roll;
        Qnode(int a, int b){
            cid = a;
            roll = b;
        }
        Qnode(int a){
            cid = a;
        }
        public String toString(){
            return (cid+" "+roll);
        }
    }
}
