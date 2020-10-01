#include <bits/stdc++.h>

using namespace std;
int calculatesum(int d)
{int sum=0;
int x;
while(d>0)
{
    x=d%10;
    d=d/10;
    sum=sum+x;
    
}

return sum;
}

int getdivisor(int n)
{
    int max=1;
    int inter;
    int lim=n/2;
    int print=1;
    for(int i=2;i<=n;i++)
    {
        if(n%i==0)
        {
            if(i>9)
            {
                inter= calculatesum(i);
                //cout << inter;
                if(inter>max)
                {
                    max=inter;
                    print=i;
                }

            }
             else
            {
                inter= i;
                
                if(inter>max)
                {
                    max=inter;
                    print=i;
                }
           
            }
        }    
           

    }
return print;
}

int main()
{
    int n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    int divisor = getdivisor(n);
    cout<<divisor;

    return 0;
}
