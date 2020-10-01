import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class Ques6 {
    public static void main(String args[])
    {Scanner s= new Scanner(System.in);
        Queue<String> q = new LinkedList<>(); 
        int n=s.nextInt();
        q.add("1");
        while(n>0)

        {
            q.add(q.peek()+"0");
            q.add(q.peek()+"1");

            System.out.println(q.remove());
           n--;


        }

        s.close();

    }

}