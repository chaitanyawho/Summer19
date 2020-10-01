//There exists an island called Arpa’s land, some beautiful girls live there, as ugly ones do.

//Mehrdad wants to become minister of Arpa’s land. 
//Arpa has prepared an exam. Exam has only one question, given n, print the last digit of 1378n.
#include <bits/stdc++.h>
#include<iostream>

using namespace std;

int main() {
    int m;
   
    cin >> m;
    int x = m%4;
    switch (x)
    {
    case 0:
        cout<<6;
        break;
    case 1:
        cout<<8;
        break;
     case 2:
        cout<<4;
        break;
    case 3:
    cout<<2;

    
    default:
        break;
    }


 
}