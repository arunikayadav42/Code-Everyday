#include <bits/stdc++.h>
#define ll long long int

using namespace std;

int main()
{
	ll n, m, a;
	cin>>n>>m>>a;
    ll ans = (ll)ceil((1.0*m)/a) * (ll)ceil((1.0*n)/a);
    cout<<ans<<endl;
	return 0;
}