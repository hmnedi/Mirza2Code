#include <bits/stdc++.h>

using namespace std;

int main(){
    string s;
    cin >> s;

    s.erase(unique(s.begin(), s.end()), s.end());

    cout << s;
}

