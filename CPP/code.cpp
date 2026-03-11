#include <iostream>
using namespace std;

class Employee{
    protected:
    string employeeName;
    int employeeNumber;
    int salary;

    public:
    //default
    Employee () {
        cout<<"Default constructor called!!\n";
        this->employeeName="Na";
        this->employeeNumber=0;
        this->salary=0;
    }

    //parameter
    Employee(string ename, int eno, int sal) {
        this->employeeName=ename;
        this->employeeNumber=eno;
        this->salary=sal;
    }

    ~Employee(){
        cout<<"Destructor called\n";
    }

    virtual int calculateSalary()=0; //pure virtual function
};

class Manager: public Employee {
    protected:
    int allowance;

    public:
    //default
    Manager () {
        cout<<"Default constructor called!!\n";
        this->allowance=0;
    }

    //parameter - member initialization list
    Manager(string employeeName, int employeeNumber, int salary, int allowance):Employee(employeeName, employeeNumber, salary) {
        this->allowance=allowance;
    }

    ~Manager(){
        cout<<"Destructor called\n";
    }

    virtual int calculateSalary()=0; //pure virtual function
};

class Admin: public Employee{
    public:
    Admin(){
        cout<<"Default constructor called!!\n";
    }

    Admin(string employeeName, int employeeNumber, int salary):Employee(employeeName, employeeNumber, salary) {
    }

    ~Admin(){
        cout<<"Destructor called\n";
    }
};

class Security: public Employee{
    protected:
    int baseSalary;

    public:
    Security(){
        cout<<"Default constructor called!!\n";
    }
    Security(string employeeName, int employeeNumber, int baseSalary):Employee(employeeName, employeeNumber, baseSalary) {
        this->baseSalary=baseSalary;
    }

    //des
    ~ Security(){
        cout<<"Destructor called!!\n";
    }
};

class Clerk: public Employee{
    protected:
    int baseSalary;

    public:
    Clerk(){
        cout<<"Default constructor called!!\n";
    }
    Clerk(string employeeName, int employeeNumber, int baseSalary):Employee(employeeName, employeeNumber, baseSalary) {
        this->baseSalary=baseSalary;
    }

    //des
    ~ Clerk(){
        cout<<"Destructor called!!\n";
    }
};

class HR: public Manager{
    protected:
    int target;

    public:
    HR(){
        cout<<"Default constructor called!!";
    }
    HR(string employeeName, int employeeNumber, int salary, int allowance, int target):Manager(employeeName, employeeNumber, salary, allowance) {
        this->target=target;
    }
    int calculateSalary() override{
        int ans = salary+allowance+(target*0.15);
        return ans;
    }
};

class Accounts: public Manager{
    protected:
    int overtimeHours;
    public:

    Accounts(){
        cout<<"Default constructor called!!";
    }
    Accounts(string employeeName, int employeeNumber, int salary, int allowance, int overtimeHours):Manager(employeeName, employeeNumber, salary, allowance) {
        this->overtimeHours=overtimeHours;
    }
    int calculateSalary() override{
        int ans = salary+allowance+(overtimeHours*1500);
        return ans;
    }
};

class Office: public Admin, public Accounts{

};

int main() {
    
    return 0;
}