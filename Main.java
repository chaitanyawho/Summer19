import java.util.*;
//Class name has to be Main.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cx= 0, yx=0;
        outer: for(int i = 0; i<s.length()-1;i++){
            for(int j = i+2;j<s.length()+1;j++){
                String t = s.substring(i, j);
                if(t.startsWith("X")&&t.endsWith("X")&&(!t.contains("Y"))) {
                    cx += j - i - 2;
                    System.out.println(cx);
                    continue outer;
                }
                else if(t.startsWith("Y")&&t.endsWith("Y")&&(!t.contains("X"))){
                    yx += j - i - 2;
                    continue outer;
                }
            }
        }
        String ss[] = s.split("");
        ArrayList<String> ch= new ArrayList<>(Arrays.asList(ss));
        cx+=Collections.frequency(ch, "X");
        yx+=Collections.frequency(ch, "Y");
        System.out.println(cx+" "+yx);
    }
}