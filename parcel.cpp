#include <bits/stdc++.h>

using namespace std;

int max_x, max_y, max_dist;

// int floodfill(int r, int c, vector<vector<int>> vec, int i, int j, vector<vector<int>> &dist)
// {
// 	if(i > r || j > c || i < 0 || j < 0)
// 		return (int)(1e9+7);
//     if(i < r && j < c && dist[i][j] > 0)
//     	return dist[i][j];
//     if(i < r && j < c && vec[i][j] == 0)
//     {
//        int left = 0, right = 0, down = 0, up = 0;

//        if(j > 0)
//        {
//        	  left += floodfill(r, c, vec, i, j-1, dist);
//        }
//        if(j < c)
//        	right += floodfill(r, c, vec, i, j+1, dist);
//        if(i > 0)
//        	up += floodfill(r, c, vec, i-1, j, dist);
//        if(i < r)
//        	down += floodfill(r, c, vec, i+1, j, dist);

//        dist[i][j] = min(left, min(right, min(up, down)));
//        if(max_dist < dist[i][j])
//        {
//        	max_dist = dist[i][j];
//        	max_x = i;
//        	max_y = j;
//        }
//        return dist[i][j];
//     }
//     return 1;
// }

int main()
{
	int t;
	cin>>t;
	int temp = 1;
	while(temp != t+1)
    {
    	int r, c;
    	cin>>r>>c;
    	vector<vector<int>> vec(r);
    	start_i = -1, start_j = -1;
    	for(int i = 0; i < r; i++)
    	{
    		vec[i] = vector<int>(c);
    		for(int j = 0; j < c; j++)
    		{
    			cin>>vec[i][j];
    			
    		}
    	}
        int max_distance = -1;
        vector<vector<int>> dist(r);
        for(int i = 0; i < r; i++)
        {
        	dist[i] = vector<int>(c);
        }
        //max_x = -1, max_y = -1, max_dist = -1;
        //cout<<floodfill(r, c, vec, start_i, start_j, dist);
        cout<<"max_X:"<<max_x<<"max_y:"<<max_y<<"max_dist"<<max_dist<<"\n";
        // cout<<"Case #"<<temp<<": "<<result<<"\n";
        // temp++;
    }

	return 0;
}