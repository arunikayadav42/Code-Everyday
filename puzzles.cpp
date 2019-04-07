#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n, m;
    cin>>n>>m;
    vector<int> vec(m);
    for(int i = 0; i < m; i++)
    {
    	cin>>vec[i];
    }
    sort(vec.begin(), vec.end());
    int mini = (int)(1e9+7);
    for(int i = 0; i <= m - n; i++)
    {
      int diff = vec[i+n-1] - vec[i];
      mini = min(mini, diff);
    }
    cout<<mini<<"\n";
	return 0;
}