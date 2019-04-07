#include <bits/stdc++.h>
#define ll long long

using namespace std;

int main()
{
	ll t;
	cin>>t;
	while(t-- != 0)
	{
		ll n, a, b, k;
		cin>>n>>a>>b>>k;
		vector<int> vec(n);
		ll count = 0;
		iota(vec.begin(), vec.end(), 1);
		for(ll i = 0; i < n; i++)
		{
			if(vec[i] % a == 0 && vec[i] % b == 0)
				continue;
			if(vec[i]%a == 0 || vec[i]%b == 0)
			count++;
		}
		// cout<<count;
		if(count>= k)
			cout<<"Win"<<endl;
		else
			cout<<"Lose"<<endl;
	}
	return 0;
}