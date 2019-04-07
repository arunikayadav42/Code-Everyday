#include <bits/stdc++.h>

using namespace std;

int main()
{
	int n;
	cin>>n;
	n++;
	while(true)
	{
		string str;
		str.append(to_string(n));
		char a = str[0];
		char b = str[1];
		char c = str[2];
		char d = str[3];
		//cout<<a<<b<<c<<d<<"\n";
		if(a == b || a == c || a == d || b == c || b == d || c== d)
			n++;
		else
		{
			cout<<n<<endl;
			break;
		}
	}
	return 0;
}