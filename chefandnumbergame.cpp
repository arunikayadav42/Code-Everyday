#include <bits/stdc++.h>

using namespace std;

int main()
{
	int t;
	cin>>t;
	while(t-- != 0)
	{
		int n;
		cin>>n;
		vector<int> vec;
		for(int i = 0; i < n; i++)
		{
			int p;
			cin>>p;
			vec.push_back(p);
		}
        int count = 0;
		for(int i = 0; i < n; i++)
		{
           if(vec[i] < 0)
           	count++;
		}
		cout<<max(count, n-count)<<" "<<min(count, n-count)<<endl;
	}
	return 0;
}