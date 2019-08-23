import javax.xml.transform.Result;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

    class Edge<T> implements Comparable<Edge>{
        private int v1, v2;
        private int w;
        public Edge(int v1, int v2, int w){
            this.v1 = v1;
            this.v2 = v2;
            this.w = w;
        }

        public int getv1(){
            return this.v1;
        }
        public int getv2(){
            return this.v2;
        }
        public int getw(){
            return this.w;
        }
        public int compareTo(Edge b){
            if(this.w<b.w)
                return -1;
            else if(this.w>b.w)
                return 1;
            else{
                if(this.v1+this.v2+this.w<=b.v1+b.v2+b.w)
                    return -1;
                else return 1;
            }
        }

    }
    class Nodes{
        int id;
        HashSet<Integer> mem = new HashSet<>();
        public void setMembers(HashSet<Integer> m){
            this.mem = m;
        }
        public Nodes(int id){
            this.id = id;
            this.mem.add(this.id);
        }
        public HashSet<Integer> getMembers() {
            return this.mem;
        }

        public boolean hasMember(Integer id) {
            return this.mem.contains(id);
        }
        public int getId(){
        return this.id;}
    }


public class Kruskals {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Nodes> allNodes = new ArrayList<>();
        ArrayList<Edge> allEdges = new ArrayList<>();
        ArrayList<Edge> mst = new ArrayList<>();
        int n = sc.nextInt();
        int e = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            allNodes.add(new Nodes(i));
        }
        for (int i = 0; i < e; i++) {
            Edge tmp = new Edge(sc.nextInt(), sc.nextInt(), sc.nextInt());
            allEdges.add(tmp);
        }
        Collections.sort(allEdges);
        for (int i = 0; i < allEdges.size(); i++) {
            Edge tmp = allEdges.get(i);
            Nodes x = allNodes.get(tmp.getv1() - 1);
            Nodes y = allNodes.get(tmp.getv2() - 1);
            if (!x.hasMember(y.getId())) {
                mst.add(tmp);

                HashSet<Integer> m = x.getMembers();
                m.addAll(y.getMembers());

                Iterator<Integer> iterator = m.iterator();
                while (iterator.hasNext()) {
                    Integer current = iterator.next();
                    allNodes.get(current - 1).setMembers(m);
                }
            }


        }  int sum = 0;
        for (int i = 0; i < mst.size(); i++) {
            sum += mst.get(i).getw();
        }
        System.out.println(sum);
    }
}

