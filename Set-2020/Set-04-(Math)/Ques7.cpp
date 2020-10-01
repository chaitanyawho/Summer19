#include<iostream>
#include<stdlib.h>
#include<string>
using namespace std;
int main()
{
    string x;
    cin>>x;
    int arr[x.length()];
    int index[x.length()];
    int ind;
    int k=0;
    for(int i=0;i<x.length();i++)
    {
        if(x.at(i)>48 && x.at(i)<57)
        {char u=x.at(i);
            arr[k]=(int)u-48;
            index[k]=i;
            cout<<arr[k]<<"-----"<<i<<"\n";
            k++;
        }
        else if(x.at(i)=='^')
        {
            ind=i;
        }



    }
    int len = x.length();
    arr[k]=-1;
    int sum=0,sum2=0;

    for(int l=0;l<len;l++)
    {
        if(arr[l] !=-1)
         {
             if(index[l]<ind)
             {
                 sum=sum+ (arr[l]*(ind-index[l]));
            
             }
             else
             {
                 sum2=sum2+ (arr[l]*(index[l]-ind));
        
             }
             


         }
         else
         {
             break;
         }
         

    }
    if(sum==sum2)
    {
        cout<<"balanced";
    }
    else if (sum>sum2)
    {
        cout<<"Left";
        
    }
    else
    {
        cout<<"Right";
    }
    
    

}