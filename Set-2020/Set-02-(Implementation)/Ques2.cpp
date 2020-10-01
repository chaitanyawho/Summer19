#include <iostream>
using namespace std;
int main()
{ int count =0;
    int n;
    cin>>n;
    string x[]={"I hate it ","I love it ","I hate that ","I love that "};
    for(int i=0;i<n-1;i++)
    {
       if (n>1)
            {
        if(i==0)
        {
           cout<<x[2];
        }
        else if(i%2==1)
        {
           
           cout<<x[3];
          
        }
        else
        {
            cout<<x[2];
        }
        
    }
    else
    {
        break;
    }
    

        
        

 }
    if(n%2==0 && n>1)
    cout<<x[1];
    else if (n>1)
    {
        cout<<x[0];
    }
    

}