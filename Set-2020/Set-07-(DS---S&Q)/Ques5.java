import java.util.*;
public class Ques5 {
    //here we are trying to find the largest positive
    // streak of petrol-distance and see if that suffices the impending
    // difference that we've been collecting, if that is possible then the start should be
    // the first positive surplus index
  
  public static int sol(int petrol[],int dis[],int n)
  {
      int start=0;
      int sum=0;
      int diff=0;

      for(int i=0;i<n;i++)
      {
          sum+=petrol[i]-dis[i];
          System.out.println("Whem sum at"+ i+"=="+sum);
          if(sum<0)
          {
              start=i+1;
              diff+=sum;
              System.out.println("Whem diff at"+ i+"=="+diff);
              sum=0;
              
          }

      }
      return sum+diff>0 ? start:-1;






  }



    public static void main(String args[])
    { Scanner s=new Scanner(System.in);

      int n=s.nextInt();
    int petrol[]=new int[n];
    int dis[]=new int[n];
          for(int i=0;i<n;i++)
      {
          petrol[i]=s.nextInt();
          dis[i]=s.nextInt();

      }
      System.out.println("Start at :"+sol(petrol,dis,n));
     


        s.close();

    }

}