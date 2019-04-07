#include <bits/stdc++.h>

using namespace std;

int main()
{
	int n;
	cin>>n;
	while(n-- != 0){
		string str;
		cin>>str;
		if(str.length() == 1)
			{
				cout<<"Yes"<<"\n";
				continue;
			}
		vector<int> vec(26);
		int mini = 100000;
		for(int i = 0; i < str.length(); i++){
			vec[str[i]-'a']++;
			//cout<<vec[str[i]-'a']<<" ";
			if(mini > str[i]-'a')
				mini = str[i]-'a';
		}
		//cout<<mini<<"\n";
		int maxi = *max_element(vec.begin(), vec.end());
		//cout<<maxi<<"\n";
		if(maxi > 1)
			{
				cout<<"No"<<"\n";
				continue;
			}
		int i = 0;
		for(; i < str.length(); i++){
			if(vec[i+mini] == 0)
			{
				cout<<"No"<<"\n";
                break;
			}
			//cout<<vec[i+mini]<<"\n";
		}
		if(i == str.length())
		{
			cout<<"Yes"<<"\n";
		}
	}
	return 0;
}