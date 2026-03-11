#include <iostream>
using namespace std;

int main() {
    unsigned long long n;
    if (!(cin >> n)) return 0;
    unsigned long long fact = 1;
    for (unsigned long long i = 1; i <= n; ++i)
        fact *= i;
    cout << fact << endl;
    return 0;
}
