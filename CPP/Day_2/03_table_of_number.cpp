#include <iostream>
using namespace std;

int main() {
    int n;
    if (!(cin >> n)) return 0;
    for (int i = 1; i <= 10; ++i)
        cout << n << " x " << i << " = " << n * i << endl;
    return 0;
}
