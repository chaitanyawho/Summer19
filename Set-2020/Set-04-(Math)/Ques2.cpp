#include<iostream>
using namespace std;
int main()
{
    int k,n,c=0,cnt=0;
    cin>>n;
   int arr[n];
   int check[n];
    for(c=0;c<n;c++)
    {
        cin>>k;
        if(k==c)
        {
            cnt++;
            arr[c]=-1;

        }
        else
        {
            arr[c]=k; //in the array cout right ones and mark at -1 and the rest check 
            
        }
        
    }
    int flag=0;
    //in bubble sort manner if any can be swapped such that count increaes by 2
            //if not increase count by 1 as this the only second option possible
    for(int i=0;i<n-1;i++)
    {
      int cmp=arr[i];
      int ccc=i;
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]==-1)
            {
                break;

            }
            else
            {
               
                if(arr[j]==-1)
                {
                    continue;
                }
                else
                {
                    if((cmp==j )&& (arr[j]==ccc))
                    {
                        cnt+=2;
                        flag=1;
                        break;

                    }
                }
                
                
            }
            

        }
        if(flag==1)
        {
            break;
        }
    }
    if(flag==0)
    {
        cnt++;
    }




cout<<cnt;

}