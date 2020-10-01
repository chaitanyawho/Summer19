#include<iostream>
// 3 13
using namespace std;
int main()
{
    int k,n,c=0;
    cin>>n>>k;
    int i;
    for(i=1;i<=n/2;i++)
    {
        if(n%i==0)
        {
            c++;
            if(c==k)
            {
                cout<<i;
            }

        }
    }
    if(k>c)
    {
        cout<<-1;
    }

}