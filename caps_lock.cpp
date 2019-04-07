#include <bits/stdc++.h>

using namespace std;

int main()
{
	string str;
	cin>>str;
    if(str[0] >= 65 && str[0] <= 90)
    {
    		if(all_of(str.begin(), str.end(), [](unsigned char c){ return isupper(c);}))
            {
		      for(int i = 0; i < str.length(); i++)
		      {
		      	str[i] += 32;
		      }
		      //cout<<"here"<<"\n";
            }
            cout<<str<<"\n";
		    exit(0);
		
    }
	else
	{
		string temp = str;
		temp[0] -= 32;
		for(int i = 1; i < str.length(); i++)
		{
			if(str[i] >= 97 && str[i] <= 122)
				{
					cout<<str<<"\n";
			        exit(0);
					//break;
				}
			temp[i] += 32;
		}
		cout<<temp<<"\n";
		exit(0);
	}
	cout<<str<<"\n";
	return 0;
}