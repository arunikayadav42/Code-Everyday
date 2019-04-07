#include <bits/stdc++.h>
#define ll long long

using namespace std;

int main()
{
	ll n;
	cin>>n;
	ll sign = -1;
	ll sum = 0;
	if(n & 1)
	{
		sum = -1*(n+1)/2;
	}
	else
        sum = (n)/2;
	cout<<sum<<"\n";
	return 0;
}