#include <iostream>
using namespace std;
#include <cmath>

// Function to calculate power using a loop
int powerWithLoop(int base, int exponent) {
    int result = 1;

    for (int i = 0; i < exponent; ++i) {
        result *= base;
    }

    return result;
}

int main() {
    int base = 2;
    int exponent = 3;

    double resultUsingPow = pow(base, exponent);
    int resultUsingLoop = powerWithLoop(base, exponent);

    cout << "Result using pow(): " << resultUsingPow << endl;
    cout << "Result using loop: " << resultUsingLoop << endl;

    return 0;
}