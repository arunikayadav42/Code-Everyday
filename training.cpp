#include <bits/stdc++.h>

using namespace std;

int main()
{
	int t;
	cin>>t;
	int temp = 1;
	while(temp != t+1)
	{
		int n, p;
		cin>>n>>p;
		vector<int> vec(n);
		for(int i = 0; i < n; i++)
		{
			cin>>vec[i];
		}
       sort(vec.begin(), vec.end());
       int result = (int)(1e9+7);
       for(int i = 0; i <= n-p; i++)
       {
       	   int maxi = vec[p+i-1];
           //cout<<maxi<<" ";
           int count = 0;
           for(int j = i; j < p+i; j++)
           {  
           	  int count_of_same_ele = 1;
              count += ((maxi - vec[j])*count_of_same_ele); 
              // if(count_of_same_ele > 1)
              // 	j--;
           }
           //cout<<"\n"<<count<<" ";
           result = min(result, count);
       }
       
       cout<<"Case #"<<temp<<": "<<result<<"\n";
       temp++;
	}
	return 0;
}