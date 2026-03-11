// addptrs.cpp
#include <iostream>
using namespace std;
int main() {
    double wages[3] = {10000.0, 20000.0, 30000.0};
    short stacks[3] = {3, 2, 1};

    // Here are two ways to get the address of an array
    double *pw=wages;
    short *ps=stacks;

    cout << "pw = " << pw << ", *pw = " << *pw << endl;
    pw = pw + 1;
    cout << "ps = " << ps << ", *ps = " << *ps << endl;

    ps = ps + 1;
    cout << "add 1 to the ps pointer:\n";
    cout << "ps = " << ps << ", *ps = " << *ps << "\n\n";

    cout << "access two elements with array notation\n";
    cout << "stacks[0] = " << stacks[0]
    << ", stacks[1] = " << stacks[1] << endl;

    cout << "access two elements with pointer notation\n";
    cout << "*stacks = " << *stacks
    << ", *(stacks + 1) = " << *(stacks + 1) << endl;
    cout << sizeof(wages) << " = size of wages array\n";
    cout << sizeof(pw) << " = size of pw pointer\n";
    return 0;
}

/**
pw = 0x16bd1aa20, *pw = 10000
ps = 0x16bd1aa14, *ps = 3
add 1 to the ps pointer:
ps = 0x16bd1aa16, *ps = 2

access two elements with array notation
stacks[0] = 3, stacks[1] = 2
access two elements with pointer notation
*stacks = 3, *(stacks + 1) = 2
24 = size of wages array
8 = size of pw pointer
 */