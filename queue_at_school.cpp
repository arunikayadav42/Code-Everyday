#include <bits/stdc++.h>

using namespace std;

int main()
{
	int n, t;
	cin>>n>>t;
	int counter = 0;
	string s;
	cin>>s;
	int i = 0; 
	for(int j = 0; j < t; j++)
	{
		for(i = 0; i < n-1; i++)
		{
			if(s[i] == 'B' && s[i+1] == 'G')
			{
				s[i] = 'G';
				s[i+1] = 'B';
				i++;
			}
		}
	}
	cout<<s<<endl;
	return 0;
}