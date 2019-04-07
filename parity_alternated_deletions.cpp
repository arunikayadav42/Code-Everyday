#include <bits/stdc++.h>

using namespace std;

int main()
{
	int n;
	cin>>n;
	vector<int> odd;
	vector<int> even;
	for(int i = 0; i < n; i++)
	{
		int p;
		cin>>p;
		if(p & 1 == 1)
			odd.push_back(p);
		else
			even.push_back(p);
	}
    if(odd.size() == even.size() || odd.size() == even.size()+1 || odd.size()+1 == even.size())
    	{
    		cout<<"0"<<"\n";
    		exit(0);
    	}
	int flag_odd = odd.size() > even.size() ? 1: 0;
    sort(odd.begin(), odd.end());
    sort(even.begin(), even.end());

	while(odd.size() != 0 && even.size() != 0){
		if(flag_odd == 1){
			odd.pop_back();
			flag_odd = 0;
		}
		else{
			even.pop_back();
			flag_odd = 1;
		}
	}
	int sum = 0;
	while(odd.size() != 0)
	{
		if(flag_odd == 1)
		{
			odd.pop_back();
			flag_odd = 0;
		}
       sum += odd.back();
       odd.pop_back();
	}
	//i = 0;
	while(even.size() != 0)
	{
		if(flag_odd == 0)
			{
				even.pop_back();
				flag_odd = 1;
			}
       sum += even.back();
       even.pop_back();
	}
	cout<<sum<<"\n";
	return 0;
}