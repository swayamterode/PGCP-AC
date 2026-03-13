#include <fstream>
#include <iostream>
using namespace std;

int main() {
    fstream file("./4_seekg_seekp.txt", ios::in | ios::out | ios::trunc);

    // Write
    file << "HelloWorld";

    // seekp - move write position to index 6
    file.seekp(6);
    file << "C++";

    // seekg - move read position to beginning
    file.seekg(0, ios::beg);
    string content;
    getline(file, content);
    cout << content << endl;  // Hello C++ld

    file.close();
}