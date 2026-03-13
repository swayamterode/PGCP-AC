#include <iostream>
#include <fstream>

using namespace std;
int main() {
    // choose the file to read  via ifstream
    ifstream inFile("./1_count_vowels.txt");
    // check the file is open or not
    if(!inFile.is_open()) {
        cout<<"File is not opened!\n";
    }else {
        cout<<"File opened!\n";
    }
    cout<<"Program to count number of vowels!";
    char ch;
    int countOfVowels=0;
    while(inFile.get(ch)) { // ✅ stops exactly when there's nothing left
        if(ch=='a'|| ch=='e' || ch=='i'|| ch=='o' || ch=='u' ||ch=='A'|| ch=='E' || ch=='I'|| ch=='O' || ch=='U'){
            countOfVowels++;
        }
    }
    cout<<"\nTotal vowels = " <<countOfVowels<<endl;
    inFile.close();//closed the file
    return 0;
}