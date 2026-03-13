// 1. create a class hierarchy -                                                                                                                                           class student
//   {      int student_id;
//    char *name
//    int age;
//    float Theory_marks;
//      public:
//      constructors - default and parameterized,  destructor,  display
//      conductExam     -  make this function pure virtual function
//      float calTotal   -  make this function pure virtual function, will return total marks
//   }

//  class sportStudent : public student
//   {      char *sportName; //like Cricket,Basketball,Football,etc.
//         int credits
//    public:
//       constructors - default, parameterized,  destructor,  display
//       override conductExam which displays "Theory Exam and physical activity needs to be done"
//      override  float calTotal, give 10 marks per credit
//   };

//   class ScienceStudent : public student
//   {       char *sp_subject; //like maths, biology, physics, etc.
//     float PracticalMarks;
//     public:
//        constructors - default, parameterized,  destructor,  display
//        override conductExam which displays "Theory Exam and Practical exams are need to be conducted"
//       override  float calTotal, add PracticalMarks in theory marks
//   };

//   write main() function and demonstrate polymorphism using above class hierarchy.
#include <iostream>
using namespace std;

class student
  {
    protected:
        int studentID;
        char *name;
        int age;
        float theoryMarks;
     public:
        student(){
            this->studentID=0;
            this->name="";
            this->age=0;
            this->theoryMarks=0;
        }
        student(int studentID, char const* name, int age, float theoryMarks) {
            this->studentID=studentID;
            this->name=(char*)name;
            this->age=age;
            this->theoryMarks=theoryMarks;
        }

        virtual void conductExam()=0; // pure virtual function
        virtual float calTotal()=0; // pure virtual function

        void display() {
            cout << "Student ID: " << studentID << "\nName: " << name << "\nAge: " << age << "\nTheory Marks: " << theoryMarks << endl;
        }
  };


 class sportStudent: public student {
    protected:
        char *sportName; //like Cricket,Basketball,Football,etc.
        int credits;
    public:
        sportStudent(){
            this->sportName="";
            this->credits=0;
        }
        sportStudent(int studentID, char const* name, int age, float theoryMarks, char const* sportName, int credits)
            : student(studentID, name, age, theoryMarks), sportName((char*)sportName), credits(credits) {}

        void conductExam() override {
            cout << "Theory Exam and physical activity needs to be done\n";
        }

        float calTotal() override{
            return credits * 10;
        }
};