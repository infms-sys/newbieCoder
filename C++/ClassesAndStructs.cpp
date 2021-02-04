#include<iostream>
using namespace std;

// struct Dog
class Dog
{
    public: // for class - modifier for access
    int age;
    float weight;

    void Bard()   // method - function
    {
        cout<<"wooof"<<endl;
    }

    void PrintDetails()
    {
        cout<<this->age<< " " <<this->weight<<endl;
    }
};

int main()
{
    Dog d = Dog(); // constructor

    d.age = 10;
    d.weight = 15.5;

    d.Bard();
    d.PrintDetails();
}
