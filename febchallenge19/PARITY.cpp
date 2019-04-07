#include <bits/stdc++.h>
#define ll long long int

using namespace std;

int main()
{
	int b, k;
	cin>>b>>k;
	vector<int> vec(k+1);
	ll result = 0;
	for(int i = 1; i <= k; i++)
	{
		cin>>vec[i];
	}
	ll last = vec[k];
	if(b % 2 == 0)
	{
		if(last % 2 == 0)
			cout<<"even"<<endl;
		else
			cout<<"odd"<<endl;
	}
    else
    {
    	ll count = 0;
    	for(int i = 1; i < k; i++)
    	{
    		count += vec[i] % 2;
    	}
    	count += last;
        if(count % 2 == 0)
        	cout <<"even"<<endl;
        else
        	cout<<"odd"<<endl;
    }
	return 0;
}