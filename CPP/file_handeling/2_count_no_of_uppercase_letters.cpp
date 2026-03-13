#include <iostream>
#include<fstream>
using namespace std;

int main() {
    ifstream inFile("./file.txt");
      // check the file is open or not
    if(!inFile.is_open()) {
        cout<<"File is not opened!\n";
    }else {
        cout<<"File opened!\n";
    }
    
    char ch;
    int countOfNumberOfUpperCaseLetter=0;
    while(inFile.get(ch)) {
        if(ch>='A' and ch<='Z'){
            countOfNumberOfUpperCaseLetter++;
        }
    }

    cout<<"Count of upper case letters: "<<countOfNumberOfUpperCaseLetter<<endl;
    inFile.close();
    return 0;
}