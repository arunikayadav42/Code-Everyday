#include <bits/stdc++.h>

using namespace std;

int main()
{
	string s1, s2;
	cin>>s1>>s2;
    int h1 = stoi(s1.substr(0, 2));
    int m1 = stoi(s1.substr(3, 2));
    int h2 = stoi(s2.substr(0, 2));
    int m2 = stoi(s2.substr(3, 2));
    int result = (60*h1+m1+60*h2+m2)/2;
    int res_h = (result)/60;
    int res_m = (result)%60;
    s1 = to_string(res_h);
    s2 = to_string(res_m);

    if(s1.length() == 1)
    	cout<<"0"<<s1<<":";
    else
    	cout<<s1<<":";

    if(s2.length() == 1)
    	cout<<"0"<<s2<<"\n";
    else
    	cout<<s2<<"\n";

	return 0;
}