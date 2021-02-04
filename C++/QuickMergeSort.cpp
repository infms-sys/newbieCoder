#include<stdfix.h>
#include<iostream>
#include<stdlib.h>
#include<time.h>


using namespace std;

const int N = 10;
int C[N];

void RandomArray(int *A, int n)
{
    srand((unsigned)time(0));
    for( int i =0; i<n; i++)
    {
        A[i] = rand()%n;
    }
}

void PrintArray(int *A, int n)
{
    for(int i = 0; i < n; i++)
    {
        cout<<A[i]<<" ";
    }
}

void QuickSort(int *A, int l, int r)
{
    int i = l, j = r, x = A[(l+r) / 2];
    cout<<"Central element is = "<<x<<endl;

    do
    {
        while(A[i]<x) i++;
        while(A[j]>x) j--;
        if(i <= j)
        {
            swap(A[i], A[j]);
            i++;
            j--;
        }
    }
    while(i <= j);
    if(l<j) QuickSort(A,l,j);
    if(i<r) QuickSort(A,i,r);
}

void Merge(int *A, int l, int m, int r)
{
    int i = l, j = m+1, k = 0;
    while((i<=m)&&(j<=r))
            if(A[i]<=A[j]){
            C[k++] = A[i++];
            }
        else C[k++] = A[j++];

    if(i>m)
        while(j<=r) C[k++]=A[j++];
    else
        while(i<=m) C[k++]=A[i++];
    for(i = 0; i<k; i++)
        {
            A[l + i] = C[i];
        }
        cout<<endl;
}

void DeleteRepeats(int *A, int size)
{
    for(int i=0; i<size; i++)
    {
        for(j=i+1; j<size;)
        {

        }
    }
}

void MergeSort(int *A, int l, int r)
{
    if(l<r)
    {
        int m = (l+r) / 2;
        MergeSort(A,l,m);
        MergeSort(A,m+1,r);
        Merge(A,l,m,r);
    }
}


int main()
{
    int A[N];
    RandomArray(A, N);
    PrintArray(A, N);
    //QuickSort(A, 0, N-1);
    //BubbleSort();
    MergeSort(A, 0, N-1);
    PrintArray(A, N);

    return 0;
}
