// Write a program to swap two integers using referncing

#include <iostream>
using namespace std;
void swap(int &, int &);

int main() {
	// your code goes here
	int a,b;
	cin>>a>>b;
	
	swap(a,b);
	
	cout<<a<<" "<<b;
	return 0;
}

void swap(int &x, int &y)
{
    int temp = x;
    x=y;
    y=temp;
}
