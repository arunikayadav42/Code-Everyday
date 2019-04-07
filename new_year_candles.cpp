#include <bits/stdc++.h>

using namespace std;

int main(){

    int a, b;
    cin>>a>>b;
     int sum = a;
    int extra = a;
    int over = 0;
    while(extra >= b){
    	int temp = extra;
    	extra = extra / b;
    	over = temp % b;
    	sum += extra;

    	extra = extra + over;
    	//cout<<extra<<" "<<over<<"\n";
    }

    cout<<sum<<"\n";

	return 0;
}