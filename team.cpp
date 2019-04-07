#include <bits/stdc++.h>

using namespace std;

int main()
{
	int n;
	cin>>n;
	int count = 0;
	while(n-- != 0)
	{
		int x, y, z;
		cin>>x>>y>>z;
		if(x+y+z > 1)
			count++;
	}
	cout<<count<<endl;
	return 0;
}