#include <iostream>
#include<fstream>

using namespace std;
int main() {
    ofstream outFile("./3_write_numbers_to_a_file.txt");
    for(int i = 1; i<=5; i++) {
        outFile<<i;
    }

    outFile.close();

    // read data from the file!
    ifstream inFile("./number_in_file.txt");
    int num;
    while(inFile>>num){
        cout<<num<<" ";
    }
    cout<<endl;
    return 0;
}