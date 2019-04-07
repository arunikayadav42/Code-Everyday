#include <bits/stdc++.h>

using namespace std;

int main()
{
	string str;
	cin>>str;
	int i = 0;
	while(i < str.length())
	{
		int temp = i;
		while(temp < str.length()-1 && str.at(temp) == str.at(temp+1))
		{
          temp++;
		}
		if(temp-i+1 >= 7)
			{
				cout<<"YES";
				break;
			}
		if(i >= str.length()-1)
		{
			cout<<"NO";
			break;
		}
		i = temp == i ? i+1: temp;
	}
	return 0;
}