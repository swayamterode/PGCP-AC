// Declare and define class point having x, y. Write set_point(int, int) and display_point( ) in format ( x , y )
#include <iostream>
using namespace std;

class MySetPointClass {
    protected:
    int x, y;
    public:
    void set_point(int x, int y) {
        this->x=x;
        this->y=y;
    }

    void display_point(){
        cout<<"("<<x<<" , "<<y<<")"<<endl;
    }
};

int main() {
    MySetPointClass obj;
    obj.set_point(12,23);
    obj.display_point();
    return 0;
}