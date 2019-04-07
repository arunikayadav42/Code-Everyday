#include <bits/stdc++.h>

using namespace std;

void printArray(bool *arr)
{
	for(int i = 0; i < 26; i++)
	{
		cout<<arr[i]<<" ";
	}
	cout<<endl;
}

int main()
{
	int t;
	cin>>t;
	while(t-- != 0)
	{
		int n;
		cin>>n;
		bool prim[26] = {true};
		memset(prim, true, sizeof(prim));
		//printArray(prim);
		int count = 0;
		for(int i = 0; i < n; i++)
		{
			string str;
			cin>>str;
            bool sec[26];
            memset(sec, false, sizeof(prim));
            for(int j = 0; j < str.length(); j++)
            {
            	if(prim[str[j]-'a'] == true)
            	{
            		sec[str[j]-'a'] = true;
            	}
            }
            memcpy(prim, sec, 26);
		}

		for (int i = 0; i < 26; i++) 
        if (prim[i])
        	count++;
		cout<<count<<endl;
	}
	return 0;
}