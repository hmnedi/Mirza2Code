#include <bits/stdc++.h>

using namespace std;

int main(){
    int n, m;
    cin >> n >> m;

    int a = n;
    int b = m;
    vector<int> v, z;
    while (a!=0 || b!=0) {
        v.push_back(a%10);
        z.push_back(b%10);
        a /= 10;
        b /= 10;
    }

    // for (int i=0;i<v.size();i++) cout << v[i] << "    " << z[i] << endl;

    for (int i=0; i<z.size();i++){
        int cnt = 0;
        for (int j=0;j<v.size();j++) {
            if (v[j] % z[i] == 0) {
                cnt++;
            }
        }
        if (cnt == 0) {
            cout << "LOCKED";
            return 0;
        }
    }

    cout << "OPEN";

}

