#include <iostream>
using namespace std;
int main()
{
    int comp=0;
    int n;
    cin>>n;
    if(n<4)
    {
        cout<<"-1";
    }
    int seven=n/7;
	int rem=n%7;
	int Four=rem/4;
	int toBecomeFour=rem%4;
	if(toBecomeFour!=0){
		if(seven>=toBecomeFour){
			Four+=((7*toBecomeFour)+toBecomeFour)/4;
			seven-=toBecomeFour;
		}
		else{
			cout<<"-1";
			return 0;
		}
	}
    
}