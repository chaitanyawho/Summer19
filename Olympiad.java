import java.util.*;
public class Olympiad {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            ArrayList<Integer> scores = new ArrayList<>(n);
            for(int i = 0; i<n ; i++){
                scores.add(sc.nextInt());
            }
            Collections.sort(scores);
            Set<Integer> score_set = new HashSet<>();
            score_set.addAll(scores);
            int c = 0;

            for(Integer i : score_set){
                if(i==0)
                    continue;
                c++;
            }
        System.out.println(c);

    }
}
