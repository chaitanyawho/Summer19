#include <bits/stdc++.h> 
using namespace std; 
/*A naive approach will be to perform the division and keep the decimal part and iterate and 
check if the given number exists or not. This will not work well when divisions such as 2/3 is
 done as it yields 0.666666666,but in programming language it will round it off to 0.666667
  so we get a 7 also which does not exists in the original a/b */

int main()
{
    int a,b,c,ans;
    cin>>a>>b>>c;
    a %= b; 
    ans= -1; 
  
    //only upto b blaces as the the pigeonhole principle states
    for (int i = 1; i <= b; i++)  
    { 
        // get every fraction places 
        // when (a*10/b)/c 
        a = a * 10; 
           
        // the required integer 
        if (a / b == c) 
             ans= i; 
             break;
          
        // mod the number 
        a %= b; //so we get only the fractional value and no slid values
    } 
    
    cout<<ans;

}