#include <bits/stdc++.h>

using namespace std;

int main(){

    vector<int> v;
    for (int i=0;i<5;i++){
        int tmp;
        cin >> tmp;
        v.push_back(tmp);
    }

    int len = v.size();

    sort(v.begin(), v.end());
    v.erase(unique(v.begin(), v.end()), v.end());

    if (len != v.size()) {
        len -= v.size();
        for (int i=0;i<len;i++) {
                v.push_back(0);
        }
    }

    sort(v.begin(), v.end());
    for (int i=0; i<v.size();i++){
        cout << v[i] << " ";
    }




}

