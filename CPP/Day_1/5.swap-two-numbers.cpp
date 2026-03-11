#include <iostream>
using namespace std;
void swap(int &num1, int &num2) {
    int temp = num1;
    num1=num2;
    num2=temp;
}
int main() {
    int num1, num2;
    cout<<"Enter two number"<<endl;
    cin>>num1>>num2;
    cout<<"Before Swap:"<<"Num 1: "<<num1<<"\t Num2: "<<num2<<endl;
    swap(num1, num2);
    cout<<"After Swap:" <<"Num 1: "<<num1<<"\t Num2: "<<num2<<endl;
    return 0;
}