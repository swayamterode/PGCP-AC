// Add getters and setters in time and point class, and call these methods from main( ).
#include <iostream>
using namespace std;

class MySetTimeClass{
    protected:
    int dd, mm, yy;
    public:
    void setDay(int d){
    if( d <= 31) dd = d;
    else cout<<"\n Invalid day.. can not be set as value of dd...";
    }
    void setMonth(int m){
    if( m <= 12) mm = m;
    else cout<<"\n Invalid month.. can not be set as value of mm...";
    }
    void setYear(int y){
    yy = y;
    }
    int getDay(){
        return dd;
    }
    int getMonth(){
        return mm;
    }
    int getYear(){
        return yy;
    }
};
int main() {
    MySetTimeClass obj;
    obj.setDay(11);
    obj.setMonth(2);
    obj.setYear(2026);

    // now cal the functions via getters
    cout<<"Date: "<<obj.getDay()<<endl;
    cout<<"Month: "<<obj.getMonth()<<endl;
    cout<<"Year: "<<obj.getYear()<<endl;
    return 0;
}