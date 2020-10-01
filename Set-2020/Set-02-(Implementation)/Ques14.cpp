#include <iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int x;
    x=n-10;
    if(x>0 && x<10)
    {
        cout<<4;
    }
    else if(x==11)
    {
        cout<<4;
    }
    else if(x==10)
    {
        cout<<15;
    }
    else
    {
        cout<<1;
    }
    

}