#include <bits/stdc++.h>

using namespace std;

int main()
{
	int k, n, w;
	cin>>k>>n>>w;
	int money = 0;
	money = k * (w*(w+1))/2;
	int result = money - n > 0 ? money - n: 0;
	cout<<result<<endl;
	return 0;
}