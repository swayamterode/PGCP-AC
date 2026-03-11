#include <iostream>
using namespace std;

int main() {
    int marks1, marks2, marks3, marks4, marks5;
    int totalMarks;
    float percentage;
    char grade;

    cout << "Enter marks for subject 1: ";
    cin >> marks1;
    cout << "Enter marks for subject 2: ";
    cin >> marks2;
    cout << "Enter marks for subject 3: ";
    cin >> marks3;
    cout << "Enter marks for subject 4: ";
    cin >> marks4;
    cout << "Enter marks for subject 5: ";
    cin >> marks5;

    totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;

    percentage = (totalMarks / 500.0) * 100;

    if (percentage > 80) {
        cout << "Grade: A+" << endl;
    }
    else if (percentage > 70) {
        cout << "Grade: A" << endl;
    }
    else if (percentage > 60) {
        cout << "Grade: B+" << endl;
    }
    else if (percentage > 50) {
        cout << "Grade: B" << endl;
    }
    else if (percentage > 40) {
        cout << "Grade: C" << endl;
    }
    else {
        cout << "Grade: Fail" << endl;
    }

    cout << "Total Marks: " << totalMarks << " / 500" << endl;
    cout << "Percentage: " << percentage << "%" << endl;

    return 0;
}
