import java.util.*;
public class Ques2 {
static String palindrome (String s)
{
int n=s.length();
    int flag=1;
    for(int i=0;i<n/2;i++)
    {
        if(s.charAt(i) != s.charAt(n-1-i))
        {
            flag =0;
            break;

        }
    }
    if(flag==1)
    {
        return "Yes";
    }
    else
    {
        return "No";
    }
}

public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    for(int i=0;i<n;i++)
    {
        String s= sc.next();
        System.out.println(palindrome(s));

    }
}

}