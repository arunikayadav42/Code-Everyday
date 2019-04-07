#include <bits/stdc++.h>

using namespace std;

int main()
{
	int s, n;
	cin>>s>>n;
	vector<pair<int, int>> pa;
	for(int i = 0; i < n; i++)
	{
		int x, y;
		cin>>x>>y;
		pa.push_back(make_pair(x, y));
	}
	sort(pa.begin(), pa.end());
	for(int i = 0; i < n; i++)
	{
		if(s > pa[i].first)
		{
			s += pa[i].second;
		}
		else
		{
			cout<<"NO"<<"\n";
			exit(0);
		}
	}
	cout<<"YES"<<"\n";
	
	return 0;
}