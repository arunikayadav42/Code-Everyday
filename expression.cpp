#include <bits/stdc++.h>

using namespace std;

int main()
{
	int a, b, c;
	cin>>a>>b>>c;
    int max_ = -1;
    int result1 = a * (b+c);
    int result2 = (a+b)*c;
    int result3 = a*b*c;
    int result4 = a + (b*c);
    int result5 = (a*b)+c;
    int result6 = a+b+c;

    max_ = max(result1, max(result2, max(result3, max(result4, max(result5, result6)))));
    cout<<max_<<"\n";
	return 0;
}