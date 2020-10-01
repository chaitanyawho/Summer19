#include <bits/stdc++.h>

using namespace std;

int lowestTriangle(int base, int area){
    double ans = (double)area/(double)base;
    ans=ans*2;

     return  ceil(ans);  // Complete this function
}

int main() {
    int base;
    int area;
    cin >> base >> area;
    int height = lowestTriangle(base, area);
    cout << height << endl;
    return 0;
}