import java.util.*;
public class Ques8 {
    public static void main(String args[]){
    Scanner s=new Scanner(System.in); 
    String in=s.next();
    String try1=s.next();
    while(!in.equals(try1))
    { int c=0,b=0;
        for(int i=0;i<in.length();i++)
        {  char a=in.charAt(i);
            if(in.charAt(i)==try1.charAt(i))
            {
                b++;

            }
           
            else if(try1.indexOf(a)>-1)
            {
                  c++;
            }

        }
        if(b==4)
        {
            System.out.println(c+ " "+b);
            break;

        }
        else
        {
            System.out.println(c+ " "+b);
            in=s.next();

        }

    }




    s.close();
}

}