    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.Scanner;
    import java.util.Stack;
    import java.util.*;
    public class AlphaBrackets {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Map<Character, Character> oc = new HashMap<Character, Character>(){{
                for(int i = 65, j = 90; i<78 ; i++, j--){
                    put((char)i, (char)j);
                }
            }};
            ArrayList<String> ip = new ArrayList<>();
            int q = sc.nextInt();
            for(int i = 0; i<q ;i++)
                ip.add(sc.next());
            outer: for(String str : ip){
                Stack<Character> stk = new Stack<>();
                for(char ch : str.toCharArray()){
                    try {
                    if(ch>64&&ch<78)
                        stk.push(ch);


                    else if ((char) oc.get(stk.peek()) == (ch))
                            stk.pop();

                    else {
                        System.out.println("Invalid");
                        continue outer;
                    }
                    }catch(EmptyStackException e){
                        System.out.println("Invalid");
                        continue outer;
                    }
                }
                if(!stk.isEmpty()){
                    System.out.println("Invalid");
                    continue;
                }
                System.out.println("Valid");
            }
        }
    }
