#include <bits/stdc++.h>

using namespace std;

int main(){

    string a;
    string b;

    cin >> a >> b;

    sort(a.begin(), a.end());
    sort(b.begin(), b.end());

    a.erase(unique(a.begin(), a.end()), a.end());
    b.erase(unique(b.begin(), b.end()), b.end());

    int cnt = 0;
    for (int i=0; i<a.size();i++){
        for (int j=0;j<b.size(); j++){
            if (a[i] == b[j]){
                cnt += 1;
            }
        }
    }

    cout << cnt;


}

