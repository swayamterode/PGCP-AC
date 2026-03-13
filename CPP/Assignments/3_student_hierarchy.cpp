#include <iostream>
#include <cstring> 
using namespace std;

// ─────────────────────────────────────────
// BASE CLASS: student (abstract)
// Cannot be instantiated directly because
// conductExam() and calTotal() are pure virtual
// ─────────────────────────────────────────
class student {
    protected:
        int studentID;
        char *name;
        int age;
        float theoryMarks;

    public:
        // Default constructor - initializes empty student
        student() {
            this->studentID = 0;
            this->name = new char[1];   // allocate 1 byte for empty string
            this->name[0] = '\0';       // null terminator
            this->age = 0;
            this->theoryMarks = 0;
        }

        // Parameterized constructor
        student(int studentID, char const* name, int age, float theoryMarks) {
            this->studentID = studentID;
            this->name = new char[strlen(name) + 1];  // +1 for null terminator
            strcpy(this->name, name);                  // copy string safely
            this->age = age;
            this->theoryMarks = theoryMarks;
        }

        // Virtual destructor - ensures correct destructor is called
        // when deleting via base class pointer
        virtual ~student() {
            delete[] name;
        }

        // Pure virtual functions - MUST be overridden by child classes
        virtual void conductExam() = 0;
        virtual float calTotal() = 0;

        // Virtual display - can be overridden and reused by child classes
        virtual void display() {
            cout << "Student ID: " << studentID
                 << "\nName: " << name
                 << "\nAge: " << age
                 << "\nTheory Marks: " << theoryMarks << endl;
        }
};


// ─────────────────────────────────────────
// CHILD CLASS 1: sportStudent
// Inherits from student
// Extra fields: sportName, credits
// ─────────────────────────────────────────
class sportStudent : public student {
    protected:
        char *sportName;  // e.g. Cricket, Basketball
        int credits;

    public:
        // Default constructor
        sportStudent() {
            this->sportName = new char[1];
            this->sportName[0] = '\0';
            this->credits = 0;
        }

        // Parameterized constructor
        // Uses initializer list to call parent constructor first
        sportStudent(int studentID, char const* name, int age, float theoryMarks,
                     char const* sportName, int credits)
            : student(studentID, name, age, theoryMarks) {
            this->sportName = new char[strlen(sportName) + 1];  // ✅ +1 outside strlen
            strcpy(this->sportName, sportName);
            this->credits = credits;
        }

        // ✅ BUG FIX 2: Destructor was missing — caused memory leak
        ~sportStudent() {
            delete[] sportName;
        }

        // Override: describe how exam is conducted for sport students
        void conductExam() override {
            cout << "Theory Exam and physical activity needs to be done\n";
        }

        // Override: total = theory marks + (credits * 10)
        float calTotal() override {
            return theoryMarks + (credits * 10);
        }

        // Override: show parent info first, then sport-specific info
        void display() override {
            student::display();  // reuse parent's display
            cout << "Sport: " << sportName
                 << "\nCredits: " << credits
                 << "\nTotal Marks: " << calTotal() << endl;
        }
};


// ─────────────────────────────────────────
// CHILD CLASS 2: scienceStudent
// Inherits from student
// Extra fields: spSubject, practicalMarks
// ─────────────────────────────────────────
class scienceStudent : public student {
    char *spSubject;      // e.g. Maths, Biology, Physics
    float practicalMarks;

    public:
        // Default constructor
        scienceStudent() {
            this->spSubject = new char[1];
            this->spSubject[0] = '\0';
            this->practicalMarks = 0.0;
        }

        // Parameterized constructor
        scienceStudent(int studentID, char const* name, int age, float theoryMarks,
                       char const* spSubject, float practicalMarks)
            : student(studentID, name, age, theoryMarks) {
            this->spSubject = new char[strlen(spSubject) + 1];  // ✅ BUG FIX 1: was strlen(spSubject+1)
            strcpy(this->spSubject, spSubject);
            this->practicalMarks = practicalMarks;
        }

        // Destructor - frees spSubject memory
        ~scienceStudent() {
            delete[] spSubject;
        }

        // Override: describe how exam is conducted for science students
        void conductExam() override {
            cout << "Theory Exam and Practical exams are need to be conducted\n";
        }

        // Override: total = theory marks + practical marks
        float calTotal() override {
            return theoryMarks + practicalMarks;
        }

        // Override: show parent info first, then science-specific info
        void display() override {
            student::display();  // reuse parent's display
            cout << "Subject: " << spSubject
                 << "\nPractical Marks: " << practicalMarks
                 << "\nTotal Marks: " << calTotal() << endl;
        }
};


// ─────────────────────────────────────────
// MAIN: Demonstrates polymorphism
// Base class pointers hold derived objects
// Correct functions called at runtime (dynamic dispatch)
// ─────────────────────────────────────────
int main() {
    student* students[2];  // array of base class pointers

    students[0] = new sportStudent(101, "Swayam Terode", 20, 75.0f, "Cricket", 5);
    students[1] = new scienceStudent(102, "Ram Sharma", 20, 90.0f, "Maths", 2);

    for (int i = 0; i < 2; i++) {
        cout << "─────────────────\n";
        students[i]->display();       // calls correct display() at runtime
        students[i]->conductExam();   // calls correct conductExam() at runtime
        cout << "Total: " << students[i]->calTotal() << endl;  // calls correct calTotal()
    }

    // Free allocated memory - virtual destructor ensures correct cleanup
    for (int i = 0; i < 2; i++)
        delete students[i];

    return 0;
}