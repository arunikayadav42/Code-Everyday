#include <bits/stdc++.h>

using namespace std;

int main()
{
	int n;
	cin>>n;
	vector<int> vec(n);
	for(int i = 0; i < n; i++)
	{
		cin>>vec[i];
	}
    int k = 1, o = -1;
	for(int i = 1; i < n; i++)
	{
		if(vec[i] >= vec[i-1])
			k++;
		else
		{
			o = max(k, o);
			k = 1;
		}
	}
	o = max(o, k);
	cout<<o<<"\n";
	return 0;
}