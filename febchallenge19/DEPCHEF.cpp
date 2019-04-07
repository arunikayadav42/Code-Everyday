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
		vector<int> attack(n+1);
		vector<int> defense(n+1);
		for(int i = 1; i <= n; i++)
		{
			int p;
			cin>>p;
			attack[i] = p;
		}
		for(int i = 1; i <= n; i++)
		{
			int p;
			cin>>p;
			defense[i] = p;
		}
		int dead_defense = -1;
        for(int i = 2; i < n; i++)
        {
        	if((defense[i] > attack[i+1]+attack[i-1]))
        	{
        		dead_defense = defense[i];
        	}
        }
        if(dead_defense == -1)
        {
        	if((defense[1] > attack[2] + attack[n]))
        	{
        		dead_defense = defense[1];
        	}
        }
        if(dead_defense == -1)
        {
        	if((defense[n] > attack[1] + attack[n-1]))
        	{
        		dead_defense = defense[n];
        	}
        }
        cout<<dead_defense<<"\n";
      
	}
	return 0;
}