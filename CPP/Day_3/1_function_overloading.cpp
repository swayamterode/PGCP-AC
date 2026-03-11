#include <iostream>
using namespace std;

    int sum(int a, int b, int c) { return a+b+c; }
    int sum(int a, int b) { return a+b; }

    float sum(float a , float b){
        return a + b;
    }

    float sum(float a, float b, float c){
        return a+b+c;
    }

    float sum(int n1, float n2){
        return (float)n1 + n2;
    }
    float sum(float n1, int n2){
        return (float)n1 + n2;
    }

int main(){
    cout<<"\n sum with 2 int...."<<sum(5,7);
    cout<<"\n sum with 3 int...."<<sum(6,7,8);
    cout<<"\n sum with 2 float..."<<sum(5.3f,2.5f);
    cout<<"\n sum with 1 int and 1 float...."<<sum(5,7.5f);
    cout<<"\n sum with 1 float and 1 int...."<<sum(5.5f,7);
    return 0;
}