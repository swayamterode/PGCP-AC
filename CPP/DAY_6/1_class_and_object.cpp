#include <iostream>
using namespace std;

class Mydate{
    protected:
    int date, month, year;
    public:
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