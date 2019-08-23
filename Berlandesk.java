import java.util.*;
public class Berlandesk {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> user = new ArrayList<>();
        String str = "";
        int c = 1;
        outer: for(int i = 0; i < n; i++){
            str = sc.next();

            if (user.contains(str)) {
                while(user.contains(str)) {
                    str += c;
                }
                System.out.println(str);
                continue outer;
            }

            user.add(str);
            System.out.println("OK");
        }
    }
}
