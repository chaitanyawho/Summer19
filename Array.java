import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        int n = sc.nextInt();
        int c1;
        for(int  i = 0; i<n;i++){
            c1 = sc.nextInt();
            if(c1<0)
                a.add(c1);
            else if(c1>0)
                b.add(c1);
            else
                c.add(c1);

        }
        if(a.size()%2==0){
            c1 = a.remove(a.size()-1);
            c.add(c1);
        }
        System.out.println(a+"\n"+b+"\n"+c);
    }
}
