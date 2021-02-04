#include<iostream>
#include<queue>

using namespace std;

struct intComparer
{
    bool operator() (int a, int b)
    {
        return a>b;
    }
};

int main()
{
    priority_queue<int, vector<int>, intComparer> q;

    q.push(9);
    q.push(14);
    q.push(2);
    q.push(1);
    q.push(7);

    cout<<q.top()<<endl;
    q.pop();

    cout<<q.top()<<endl;
    q.pop();

    cout<<q.top()<<endl;
    q.pop();

    cout<<q.top()<<endl;
    q.pop();

    cout<<q.top()<<endl;
    q.pop();
}
