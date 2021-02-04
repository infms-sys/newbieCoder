#include<iostream>
#include<vector>
#include<string>
#include<iterator>

using namespace std;

int main()
{
    vector <string> words;
    words.push_back("baubau");
    words.push_back("mquhau");
    words.push_back("xoxoxo");
    words.push_back("hahaha");
    words.push_back("hihihi");

    copy(words.begin(), words.end(), ostream_iterator<string>(cout, " "));
}
