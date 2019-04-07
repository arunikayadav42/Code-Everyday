#include <bits/stdc++.h>

using namespace std;

int main()
{
	int n, k;
	cin>>n>>k;
	vector<int> vec(k);
	for(int i = 0; i < n; i++)
	{
		int p;
		cin>>p;
		++vec[p%k];
	}
	//int visited[n];
	int result = 0;
	//memset(visited, 0, sizeof(visited));
    // for(int i = 0; i < n; i++)
    // 	cout<<visited[i]<<"\n";
    result += (int)vec[0]/2;

    if(k%2 == 0)
    {
    	result += (int)vec[k/2]/2;
    	for(int i = 1; i < k/2; i++)
		{
			int j = k-i;
			result += min(vec[i], vec[j]);
		}
    }
    else
    {
    	for(int i = 1; i <= k/2; i++)
		{
			int j = k-i;
			result += min(vec[i], vec[j]);
		}
    }
	
	cout<<result*2<<endl;
	return 0;
}