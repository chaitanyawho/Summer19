/*
Dr. Evil kidnapped Mahmoud and Ehab in the evil land because of their performance in the Evil Olympiad in Informatics (EOI). 
He decided to give them some problems to let them go.
Dr. Evil is interested in sets, He has a set of n integers. 
Dr. Evil calls a set of integers evil if the MEX of it is exactly x.
the MEX of a set of integers is the minimum non-negative integer that doesn't exist in it. 
For example, the MEX of the set {0, 2, 4} is 1 and the MEX of the set {1, 2, 3} is 0 .
Dr. Evil is going to make his set evil. To do this he can perform some operations. 
During each operation he can add some non-negative integer to his set or erase some element from it. 
What is the minimal number of operations Dr. Evil has to perform to make his set evil?
*/
#include <iostream>
using namespace std;
int main()
{
    int x;
    int n;
    cin>>n>>x;
    int arr[n];
    int k;
        int sum=0;
    for(int i=0;i<n;i++)
    {

        cin>>k;
       arr[i]=k;
       if(k==x)
      { sum++; // if that number exists one op to remove it
      }
            
    }
    int i=0;

    while(arr[i]<x && (i<(n-1))) //now check diff b/w al numbers smaller than x
    {
        if(arr[i+1]>x)
         {
             sum=sum+ x-arr[i]-1;  //if larger than x, then consider x as upper limit
             break;
         }
         else
         {
              sum=sum+ arr[i+1]-arr[i]-1;
         }
         
       
        i++;


    }
    cout<<sum;
   



    }
   
    
