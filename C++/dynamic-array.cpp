#include<iostream>
#include<cmath>
using namespace std;

int* SquareRootsArray(int lastSquare)
{
    int *sqRoots = new int[lastSquare + 1];
    for(int i=0; i<=lastSquare; i++)
    {
        sqRoots[i] = sqrt(i);
    }
    return sqRoots;
}

int main()
{
    int* roots = SquareRootsArray(5);

    int numberToRoot;
    cin>>numberToRoot;

    cout<<roots[numberToRoot]<<endl;
    delete[] roots;

    cout<<roots<<endl;
}
