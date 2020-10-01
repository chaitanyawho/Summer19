#include <bits/stdc++.h>

using namespace std;

/*
 * Complete the summingSeries function below.
 */
int summingSeries(long n) {
    long ans =n;
   
    //(ab)%n = ((a%n)*(b%n))%n  
    //this has to be used long long unable to save answer calculated in the straight forward approach

    ans=ans % (1000000000+7);
    ans=ans*ans;
    ans=ans%(1000000000+7);
 
return ans;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int t;
    cin >> t;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    for (int t_itr = 0; t_itr < t; t_itr++) {
        long n;
        cin >> n;
        cin.ignore(numeric_limits<streamsize>::max(), '\n');

        int result = summingSeries(n);

        fout << result << "\n";
    }

    fout.close();

    return 0;
}
