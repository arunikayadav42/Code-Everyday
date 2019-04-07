#include <bits/stdc++.h>

using namespace std;

int main()
{
	string s;
	cin>>s;
	bool occv = false;
	bool occh = false;
	for(auto& x: s)
	{
		if(x == '0')
		{
           if(occv)
           {
           	cout<<"1 1\n";
           }
           else
           {
           	cout<<"3 1\n";
           }
           occv = !occv;
		}
		else
		{
           if(occh)
           {
           	cout<<"1 1\n";
           }
           else
           	cout<<"1 3\n";
           occh = !occh;
		}
	}
	return 0;
}