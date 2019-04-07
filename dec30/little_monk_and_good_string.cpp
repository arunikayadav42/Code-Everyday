#include <bits/stdc++.h>

using namespace std;

int main(){
	string s;
	cin>>s;
	int max = 0;
	for(int i = 0; i < s.length(); i++){
        if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u'){
        	int j = i;
        	while(j < s.length() && s[j] == 'a' || s[j] == 'e' || s[j] == 'i' || s[j] == 'o' || s[j] == 'u'){
        		j++;
        	}
        	if(max < j-i){
                max = j-i;
        	}
        	i = j;
        }
               
	}
	cout<<max<<endl;
	return 0;
}