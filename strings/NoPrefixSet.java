package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Trie1 {
    private class TrieNode {
        Map<Character, TrieNode> children;
        boolean eow;
        int occ;

        public TrieNode() {
            children = new HashMap<>();
            eow = false;
            occ = 1;
        }
    }

    private final TrieNode root;

    Trie1() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);

            } else {
                current.occ++;
            }

            current = node;
        }
        current.eow = true;
    }

    public int search(String word) {
        TrieNode current = root;
        TrieNode prev = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if(node==null)
                return -1;
            System.out.println(current.children);
            if (current.eow)
                return 0;
            prev = current;
            current = node;
        }
        //if(current.eow)
          //  return 0;
        return 1;
    }
}
public class NoPrefixSet {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        Trie1 t = new Trie1();
        t.insert(sc.next());
    boolean flag = true;
        while(--n>0) {
            String s = sc.next(); 
            if(t.search(s)==0) {
                System.out.println("BAD SET\n" + s);
                flag = false;
                break;
            }
            t.insert(s);
        }
        if(flag)
            System.out.println("GOOD SET");
        
    }
}

