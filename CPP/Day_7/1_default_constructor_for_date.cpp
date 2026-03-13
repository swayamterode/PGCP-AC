#include <iostream>
using namespace std;

class Mydate{
    protected:
    int date, month, year;
    public:

    //default constructor
    Mydate(){
        this->date=0;
        this->month=0;
        this->year=0;
    }
    //parameterized constructor
    Mydate(int d, int m, int y) {
        if(d < 0 || m < 0 || y < 0) {
            cout<<"Values Invalid!!"<<endl;
        }
        this->date=d;
        this->month=m;
        this->year=y;
    }
    // setter
    void setDate(int date, int month, int year){
        this->date=date;
        this->month=month;
        this->year=year;
    }
    // getter
    void getDate() {
        cout<<"Day: " <<date << " Month: "<< month <<" Year: " <<year<<endl;
    }
};

int main() {
    Mydate obj;
    obj.setDate(23,10,2023);
    obj.getDate();
    return 0;
}