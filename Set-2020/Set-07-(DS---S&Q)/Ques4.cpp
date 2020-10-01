#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t,a=0,b=0,c=0,d=0;//all are zero 
	cin>>t;
	queue<int>q[5];
	while(t--)
	{
		char type;
		cin>>type;
		if(type=='E')
		{
			int schl,y;
			cin>>schl>>y;//sch is for school3
			if(q[schl].size()) //if size yes the push else push and mark all four queues
			{
				q[schl].push(y);
				continue;
			}
			q[schl].push(y);
			if(!a)a=schl;
			else if(!b)b=schl;
			else if(!c)c=schl;
			else if(!d)d=schl;
		}
		else
		{
			cout<<a<<" "<<q[a].front()<<"\n";
			q[a].pop();
			if(!q[a].size())
			{
				a=b;//if a's size is zero the switch upwarrds
				b=c;
				c=d;
				d=0;
			}
		}
	}
	return 0;
}