import javax.security.sasl.SaslClient;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.*;

public class Scrapbook {
    public static void main(String[] args) {
        Queue<Integer> pgn = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int curr = 0, count = 0;
        int q = sc.nextInt();
        ArrayList<String> ip =new ArrayList<>(q);
        sc.nextLine();
        BitSet b = new BitSet();
        while(q-->0)
            ip.add(sc.nextLine());
        for(String i : ip){
            if(i.equals("A")) {
                if (pgn.isEmpty() && !b.get(curr+1)) {//next ++
                    curr++;
                    b.set(curr);
                    //System.out.println(curr);
                }else if(pgn.isEmpty()){//next free ++
                    while(b.get(curr))
                        curr++;
                    b.set(curr);
                }else{//queue
                    curr=pgn.poll();
                    b.set(curr);
                }
                count++;
                System.out.println(curr);
            }
            else{
                count--;
                //System.out.println(Arrays.asList(i.split(" ")));
                pgn.offer(Integer.parseInt(i.split(" ")[1]));
                b.clear(Integer.parseInt(i.split(" ")[1]));
            }
        }
        System.out.println(count);

    }
}
