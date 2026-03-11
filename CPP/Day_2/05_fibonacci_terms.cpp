#include <iostream>
using namespace std;

int main() {
    int t;
    if (!(cin >> t)) return 0;
    int a = 0, b = 1;
    for (int i = 0; i < t; ++i) {
        cout << a;
        if (i + 1 < t) cout << endl;
        int next = a + b;
        a = b;
        b = next;
    }
    if (t > 0) cout << endl;
    return 0;
}
