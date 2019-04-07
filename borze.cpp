#include <bits/stdc++.h>

using namespace std;

int main()
{
	string s;
	cin>>s;
	string str;
	int n = s.length();
	for(int i = 0; i < n; i++)
	{
		if(s[i] == '.')
			str += "0";
		else if(s[i] == '-')
		{
			if(i < n-1 && s[i+1] == '.')
				str += "1";
			else if(i < n-1 && s[i+1] == '-')
				str += "2";
			i++;
		}
	}
	cout<<str<<endl;
	return 0;
}