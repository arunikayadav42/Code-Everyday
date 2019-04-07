#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n, l;
    cin>>n>>l;
    vector<int> vec(n);
    for(int i = 0; i < n; i++)
    {
    	cin>>vec[i];
    }
    sort(vec.begin(), vec.end());

    double l1, l2, l3;

    l2 = abs(vec[0] - 0);
    l3 = abs(vec[n-1] - l);
    int max_dist = -1;
    for(int i = 1; i < n; i++)
    {
    	int dist = vec[i] - vec[i-1];
    	max_dist = max(dist, max_dist);
    }
    cout<<setprecision(10);
    cout<<fixed;
    cout<<max((max_dist*1.0)/2, max(l2, l3));
    
    cout<<"\n";
	return 0;
}