#include <bits/stdc++.h>

using namespace std;

int INF = 1e9;

int main()
{
	int n, m;
	cin>>n>>m;
	vector<int> a(n);
	vector<pair<int, int>> b;
	for(int i = 0; i < n; i++)
	{
		cin>>a[i];
	}
    for(int i = 0; i < m; i++)
    {
    	int l, r;
    	cin>>l>>r;
    	b.push_back({l-1, r-1});
    }
    vector<int> result;
    int max_result = *max_element(a.begin(), a.end()) - *min_element(a.begin(), a.end());
    for(int i = 0; i < n; i++)
    {
    	vector<int> add(n+1);
    	vector<int> cur;
    	for(int j = 0; j < m; j++)
    	{
    		if(!(b[j].first <= i && b[j].second>= i))
    		{
    			cur.push_back(j+1);
                for(int k = b[j].first; k <= b[j].second; k++)
                	--add[k];
    		}
    	}
    	int mn = INF, mx = -INF;
    	for(int j = 0; j < n; j++)
    	{
    		mn = min(mn, add[j] + a[j]);
    		mx = max(mx, add[j] + a[j]);
    	}
        if(mx - mn > max_result)
        {
        	max_result = mx - mn;
        	result = cur;
        }

    }
    cout<<max_result<<"\n"<<result.size()<<"\n";
    for(auto i: result)
    	cout<<i<<" ";
    cout<<"\n";
	return 0;
}