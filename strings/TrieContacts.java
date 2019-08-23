package strings;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
class Trie{
    private class TrieNode{
        Map<Character, TrieNode> children;
        boolean eow;
        int occ;
        public TrieNode(){
            children = new HashMap<>();
            eow = false;
            occ = 1;
        }
    }
    private final TrieNode root;
    Trie(){
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode current = root;
        for( int i = 0; i<word.length() ; i++){
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if(node == null){
                node = new TrieNode();
                current.children.put(ch, node);

            }else{
                current.occ++;
            }

            current = node;
        }
        current.eow = true;
    }
    public int search(String word){
        TrieNode current = root;
        TrieNode prev = root;
        for(int i = 0; i<word.length() ; i++){
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if(node == null)
                return 0;
            prev = current;
            current = node;
        }
        //int leaves = getLeaves(prev);
        //System.out.println(leaves);
        return current.occ;
    }
    public int getLeaves(TrieNode tnode){
        int r = 0;
        System.out.println(tnode.children);
        if(tnode.eow)
            r+=1;

            for(Character c : tnode.children.keySet()){
                r+=getLeaves(tnode.children.get(c));
            }

        return r;
    }
}

public class TrieContacts {

    /*
     * Complete the contacts function below.
     */
    static int[] contacts(String[][] queries) {
        /*
         * Write your code here.
         */
        Trie t = new Trie();
        int res[] = new int[queries.length];
        int k = 0;
        for(int i = 0; i<queries.length; i++){
            if(queries[i][0].charAt(0)=='a'){
                System.out.println("added"+queries[i][1]);
                t.insert(queries[i][1]);
            }else{
                res[k++] = (t.search(queries[i][1]));
            }
        }
        int o[] = new int[k];
        for(int i = 0; i<k;i++)
            o[i] = res[i];
        return o;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int queriesRows = Integer.parseInt(scanner.nextLine().trim());

        String[][] queries = new String[queriesRows][2];

        for (int queriesRowItr = 0; queriesRowItr < queriesRows; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 2; queriesColumnItr++) {
                String queriesItem = queriesRowItems[queriesColumnItr];
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int[] result = contacts(queries);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
