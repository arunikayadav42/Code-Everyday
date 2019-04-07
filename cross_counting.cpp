#include <bits/stdc++.h>

using namespace std;

int main()
{
	int n;
	cin>>n;
	vector<vector<int>> vec(n);
	if(n < 3)
		cout<<"0"<<endl;
	else
	{
		for(int i = 0; i < n; i++)
		{
			string str;
			cin>>str;
			//cout<<str.at(0)<<endl;
			vec[i] = vector<int>(n, 0);
			for(int j = 0; j < str.length(); j++)
			{
	           if(str.at(j) == '.')
	           vec[i].push_back(1);
	           else if(str.at(j) == 'X')
	           vec[i].push_back(0);  
			}
		}
		int count = 0;
		for(int i = 1; i < n-1; i++)
		{
			for(int j = 1; j < n-1; j++)
			{
               if(vec[i-1][j-1] == 0 && vec[i-1][j+1] == 0 && vec[i+1][j-1] == 0 && vec[i+1][j+1] == 0)
                {
                	cout<<i<<", "<<j<<endl;
                	count++;
                }
			}
		}
		cout<<count<<endl;
	}
	

	return 0;
}