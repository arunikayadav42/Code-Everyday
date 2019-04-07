#include <bits/stdc++.h>

using namespace std;

int main()
{
	int n, m;
	cin>>n>>m;

	int extra = n / m;
	int sum = n;
	//cout<<extra;
	while(n >= m){
		sum += extra;
		extra = n/m + (n%m);
		n = extra;
		extra = n/m;
	}

	cout<<sum<<"\n";
	return 0;
}