#include <bits/stdc++.h>

using namespace std;

int main()
{
	string str;
	cin>>str;
	stack<int> vec;
	int n_of_deletions = 0;
	vec.push(str[0]);
	int i = 1;
	while(i < str.length())
	{
        if(!vec.empty() && vec.top() == str[i])
        {
        	vec.pop();
        	n_of_deletions++;
        }
        else
        	vec.push(str[i]);
        i++;
	}
		//cout<<player1 << player2<<endl;
		if(n_of_deletions % 2 != 0)
			cout<<"Yes";
		else
			cout<<"No";
	return 0;
}