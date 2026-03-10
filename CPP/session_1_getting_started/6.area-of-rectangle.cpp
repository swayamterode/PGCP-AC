#include <iostream>
using namespace std;

int calculateArea(int &len, int &width){
    return len*width;
}

int main() {
    int len, wid;
    cout<<"Enter the length of the rectangle:\t";
    cin>>len;
    cout<<"Enter the width of the rectangle:\t" ;
    cin>>wid;

    int result = calculateArea(len, wid);
    cout<<"Result:\t" << result <<endl;
    return 0;
}