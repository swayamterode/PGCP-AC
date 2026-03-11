#include <iostream>
using namespace std;
int main() {
    int num;
    cout<<"Enter the number: ";
    cin>>num;
    cout<<num<<" is "<<(num % 2 ? "Odd Number!":"Even Number!")<<endl;
    return 0;
}