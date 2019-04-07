#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);


 /* Complete the 'getTimes' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY time
 *  2. INTEGER_ARRAY direction
 */

int mini_time(int enter, int exit, vector<int> time)
{
    if(time[enter] > time[exit])
    return 1;

    else if(time[exit] > time[enter])
    return 0;

    return -1;
}
vector<int> getTimes(vector<int> time, vector<int> direction) {
   vector<int> result(time.size());

   int n = time.size();

   vector<int> enter;
   vector<int> exit;

  int previous_second = -1;
   for(int i = 0; i < n; i++)
   {
       if(direction[i] == 0)
       enter.push_back(i);
       else
       exit.push_back(i);
   }
   int enter_index = 0, exit_index = 0;
   int counter = 0;
   bool last_exit_status = false;
   int ele = -1;
   while(enter_index != enter.size() && exit_index != exit.size())
   {
        int to_enter = enter[enter_index];
        int to_exit = exit[exit_index];
        int current = mini_time(to_enter, to_exit, time);
        if(current == -1)
        {
            if(previous_second == -1 || ((time[to_exit]) - previous_second) > 1 || last_exit_status == true)
            {
                result[to_exit] = counter;
                last_exit_status = true;
                counter++;
                previous_second = counter;
                time[to_enter]++;
                exit_index++;
                ele = to_exit;
            }

            else
            {
              result[to_enter] = counter;
                last_exit_status = false;
                counter++;
                previous_second = counter;
                time[to_exit]++;
                enter_index++;
                ele = to_enter;
            }
        }
        else if(current == 0)
        {
                result[to_enter] = counter;
                last_exit_status = false;
                counter++;
                previous_second = counter;
                enter_index++;
                ele = to_enter;
        }
        else if(current == 1)
        {
                result[to_exit] = counter;
                last_exit_status = true;
                counter++;
                previous_second = counter;
                //time[to_enter]++;
                exit_index++;
                ele = to_exit;
        }
        //cout<<ele<<" ";
   }

   while (exit_index != exit.size()) {
     if (counter > time[exit[exit_index]])
       time[exit[exit_index]] = counter;
     result[exit[exit_index]] = time[exit[exit_index]];
     counter = max(counter++, time[exit[exit_index]]);
     exit_index++;
   }
   //cout << counter;
   while (enter_index != enter.size()) {
     if (counter > time[enter[enter_index]])
       time[enter[enter_index]] = counter;
     cout << time[enter[enter_index]] << " " << enter[enter_index];
     //cout << time[enter[enter_index]];
     result[enter[enter_index]] =  time[enter[enter_index]];
     counter = max(counter++, time[enter[enter_index]]);
     //counter++;
     enter_index++;
   }
   cout<<result[0]<<" "<<result[1]<<" "<<result[2]<<" "<<result[3]<<" ";
   return result;
}


int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string time_count_temp;
    getline(cin, time_count_temp);

    int time_count = stoi(ltrim(rtrim(time_count_temp)));

    vector<int> time(time_count);

    for (int i = 0; i < time_count; i++) {
        string time_item_temp;
        getline(cin, time_item_temp);

        int time_item = stoi(ltrim(rtrim(time_item_temp)));

        time[i] = time_item;
    }

    string direction_count_temp;
    getline(cin, direction_count_temp);

    int direction_count = stoi(ltrim(rtrim(direction_count_temp)));

    vector<int> direction(direction_count);

    for (int i = 0; i < direction_count; i++) {
        string direction_item_temp;
        getline(cin, direction_item_temp);

        int direction_item = stoi(ltrim(rtrim(direction_item_temp)));

        direction[i] = direction_item;
    }

    vector<int> result = getTimes(time, direction);

    for (int i = 0; i < result.size(); i++) {
        fout << result[i];

        if (i != result.size() - 1) {
            fout << "\n";
        }
    }

    fout << "\n";

    fout.close();

    return 0;
}

string ltrim(const string &str) {
    string s(str);

    s.erase(
        s.begin(),
        find_if(s.begin(), s.end(), not1(ptr_fun<int, int>(isspace)))
    );

    return s;
}

string rtrim(const string &str) {
    string s(str);

    s.erase(
        find_if(s.rbegin(), s.rend(), not1(ptr_fun<int, int>(isspace))).base(),
        s.end()
    );

    return s;
}