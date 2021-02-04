#include<iostream>
#include<vector>
using namespace std;

int GetSum(const vector<int> &num)
{   //this function can't edit nums
    int sum = 0;
    int numsSize = num.size();
    for(int i=0; i<numsSize; i++)
    {
        sum += num[i];
    }
    return sum;
}

int main()
{
    vector<int> numbers;
    numbers.push_back(2);
    cout<<GetSum(numbers)<<endl;
}
