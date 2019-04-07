#include <bits/stdc++.h>

using namespace std;

int main()
{
	int n, t;
	cin>>n>>t;

	vector<int> vec(n-1);
	for(int i = 0; i < n-1; i++)
	{
		cin>>vec[i];
	}
	int step = 1;
	while(step <= t){
		step += vec[step-1];
		if(step == t)
		{
			cout<<"YES"<<"\n";
			exit(0);
		}
		else if(step > t)
		{
           cout<<"NO"<<"\n";
		   exit(0); 
		}
	}
	return 0;
}