#include <bits/stdc++.h>

using namespace std;

int main()
{
	int n;
	cin>>n;
	vector<int> vec(n);
	for(int i = 0; i < n; i++)
	{
		int p;
		cin>>p;
		vec[i] = p;
	}
	sort(vec.begin(), vec.end());
    
    int maximum = -1;
    int j;
	for(int i = 0; i < n; i++)
	{
		int result = 0;
		
		for(; j < n && vec[j] <= vec[i]+5; j++);

		maximum = max(maximum, j-i);
	}
	cout<<maximum<<endl;
	return 0;
}