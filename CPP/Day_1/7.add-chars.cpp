#include <iostream>
using namespace std;
int main() {
    char a, b;
    cout<<"Enter the chars:\t";
    cin>>a>>b;
    cout<<"Addition of chars (ASCII)\t"<<a+b<<endl;
    
    string ans="";
    ans+=a;
    ans+=b;
    cout<<"Addition of strings:\t"<<ans<<endl;
    return 0;
}