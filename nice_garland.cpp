#include <bits/stdc++.h>

using namespace std;

int main()
{
	int n;
	cin>>n;
	string s;
	cin>>s;
	vector<int> p(3);
	iota(p.begin(), p.end(), 0);
	for(auto i: p)
	{
		cout<<i<<" ";
	}
	string colors = "RGB";
	string res = "";
	int cost_variable = 0, minimum = 1e9;
	do
	{
       string t;
       int cnt = 0;
       for(int j = 0; j < n; j++)
			{
				t += colors[p[j%3]];
				cnt += t[j] != s[j];
			}
		if(minimum > cnt)
			{
				res = t;
               minimum = cnt;
			}
	}while(next_permutation(p.begin(), p.end()));
	cout<<minimum<<" "<<endl << res<<endl;
}