#include <bits/stdc++.h>
using namespace std;

const int ma = 1e5+5;
priority_queue<int> high;
priority_queue<int, std::vector<int>, std::greater<int>> low;
int fre[ma];

int main(){
	int q;
	cin>>q;
	while(q-- != 0){
		string str;
		cin>>str;
		if(str.compare("CountHigh") == 0){
			while(!high.empty() && fre[high.top()] == 0)
				high.pop();
			if(high.empty())
				cout<<"-1"<<endl;
			else{
                cout<<fre[high.top()]<<endl;
			}
		}
		else if(str.compare("Push") == 0){
            int x = 0;
            cin>>x;
            high.push(x);
            low.push(x);
            fre[x]++;
		}
		else if(str.compare("Diff") == 0){
			while(!high.empty() && fre[high.top()] == 0)
				high.pop();
			while(!low.empty() && fre[low.top()] == 0)
				low.pop();
			if(high.empty() && low.empty())
				cout<<"-1"<<endl;
			else{
				if(high.top() == low.top())
			{
				cout<<"0"<<endl;
				fre[high.top()]--;
			}
			else{
				cout<<high.top()-low.top()<<endl;
				fre[high.top()]--;
				fre[low.top()]--;
			}
			}
		}
		else{
			while(!low.empty() && fre[low.top()] == 0)
				low.pop();
			if(low.empty())
				cout<<"-1"<<endl;
			else{
                cout<<fre[low.top()]<<endl;
			}
		}

	}
	return 0;
}