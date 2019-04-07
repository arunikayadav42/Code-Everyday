#include <bits/stdc++.h>
#define total 0
#define free 1
#define used 2

using namespace std;

int main()
{
	int t;
	cin>>t;
	while(t-- != 0)
	{
		int n;
		cin>>n;
		vector<pair<int, int>> jars(n+1);
		int max_value = -1;
		for(int i = 1; i <= n; i++)
		{
			int p;
			cin>>p;
			jars[i].first = p;
			jars[i].second = 1;
			max_value = max(max_value, p); 
		}
		
		vector<int> update(n+1);
        sort(jars.begin(), jars.end());
        update[total] = max_value;
        update[used] = n;
        update[free] = update[total] - update[used];
        //memset(jars, 1, n+1);
        int k = 1;
        while(jars[n].first != jars[n].second)
        {
           vector<pair<int, int>>::iterator i;
           for(i = jars.begin()+1; i != jars.end(); ++i)
           {
              if(jars[k].second == jars[k].first)
              {
              	k++;
              	update[free] += jars[k].second;
              	update[used] -= jars[k].second;
              	jars.erase(jars.begin()+1);
              }

              else
              {
              	if(update[free] > 0)
              	{
              		update[used]++;
              		update[free]--;
              	}
              else
              {
              	update[total]++;
              	update[used]++;
              }
              int p = i->second;
              	p++;
              	i->second = p;
              }

           }
        }
		cout<<update[total]<<endl;
	}
	return 0;
}