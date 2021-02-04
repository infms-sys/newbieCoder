#include <iostream>
using namespace std;



 void EnterArray(int *arr, int n)
{
	for (int i = 0; i < n; i++)
	{
		cout<<endl;
		cout<<"myArray["<<i<<"] = ";
		cin >> arr[i];
	}
	
};
 void PrintArray(int *arr, int n)
 {
	 cout<<endl;
	for (int i = 0; i< n; i++)
	{
		cout<<"myArray["<<i<<"] =" << arr[i]<<endl;
	}
 };

void DirectSort( int *arr, int n) {
	int i,j,k,min;
	for( i=0; i< n - 1; i++)
	{
		min = arr[i]; k = i;
		for(j = i + 1; j < n; j++)
		{
			if(arr[j] < min)
			{
				min = arr[j]; k = j;
			}
		}
		if (k!= i) swap (arr[i], arr[k]);
	}
};

void BubbleSort (int *arr, int n)
{
	for(int i = 0; i < n - 1; i++)
	{
		for(int j = n-1; j > i; j--)
		{
			if(arr[j] < arr[j-1])
			{
				swap(arr[j], arr[j-1]);
			}
		}
	}
	/*for(int j=n-1; j>0; j--){ 
	for(int i=0; i<j; i++){
		if(arr[i] > arr[i+1]){
			swap(arr[i], arr[i+1]);
		}
	}
} */
};



void InsertSort(int *arr, int n)
{
	for(int i = 0; i < n; i++)
	{
		int x = arr[i];
		int j = i;
		while(j>0 && arr[j-1] > x)
		{
			arr[j] = arr[j-1];
			j--;
		}
		arr[j] = x;
	}
};


int main()
{
	const int N = 5;
	int myArray[N];
	
	EnterArray(myArray, N); 
	cout<<"\n DIRECT SORT"<<endl;
	
	DirectSort(myArray, N);  
	
	PrintArray(myArray, N);
	
	
	EnterArray(myArray, N);
	cout<<"\n BUBBLE SORT"<< endl;
	
	BubbleSort(myArray, N);
	
	PrintArray(myArray, N);
	
	EnterArray(myArray, N);
	cout<<"\n INSERT SORT"<< endl;
	
	InsertSort(myArray, N);
	
	PrintArray(myArray, N);
	system ("PAUSE");
	return 0; 
}
