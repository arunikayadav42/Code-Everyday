#include <bits/stdc++.h>

using namespace std;

int main()
{
	int n;
	cin>>n;
	int x = 0;
	while(n-- != 0)
	{
		string s;
		cin>>s;
		if(s[0] == '+' || s[2] == '+')
			x++;
		else if(s[0] == '-' || s[2] == '-')
			x--;
	}
	cout<<x<<"\n";
	return 0;
}