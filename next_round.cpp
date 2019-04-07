#include <bits/stdc++.h>

using namespace std;

int main()
{
	int n, k;
	cin>>n>>k;
	vector<int> vec(n);
	int result = 0;
	for(int i = 0; i < n; i++)
	{
      cin>>vec[i];
	}
	int score = vec[k-1];
	for(int i = 0; i < n; i++)
	{
		if(vec[i] >= score && vec[i] > 0)
            result++;

	}
	cout<<result<<endl;
	return 0;
}