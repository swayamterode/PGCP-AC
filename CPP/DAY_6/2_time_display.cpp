// Declare and define class time having hh,mm,ss. Write accept_time( ) and display_time( ) in format “ hh : mm : ss “

#include <iostream>
using namespace std;
class MyTime{
    protected:
    int hh, mm, ss;

    public:
    void accept_time(int hh, int mm, int ss) {
        this->hh=hh;
        this->mm=mm;
        this->ss=ss;
    }

    void display_time(){
        cout<<hh<<" : "<<mm <<" : "<<ss<<endl;
    }
};
int main() {
    MyTime obj;
    obj.accept_time(12,45,56);
    obj.display_time();
    return 0;
}