#include <iostream>
using namespace std;
int main()
{ int count =0;
    int n;
    cin>>n;
    char  x[3];
    for(int i=0;i<n;i++)
    {
        cin>>x;
        if(x[1]=='+')
        {
            count++;
        }
        else
        {
            count--;
        }
        

    }
    cout<<count;

}

    

