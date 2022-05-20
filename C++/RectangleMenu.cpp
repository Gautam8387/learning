#include <iostream>
#include <math.h>
using namespace std;

int main() {
	// your code goes here
	char ch, ch1;
	float l, b, peri, area, diag;
	cout<<"Rectangle Menu!"<<"\n1. Area \n2. Perimeter \n3. Diagomal \n4. Exit \n";
	cout<<"Enter Your Choice.";
	
	do
	{
	    cin>>ch;
	    if(ch == '1' || ch == '2' || ch == '3')
	    {
	        cout<<"Enter length & breadth: ";
	        cin>>l>>b;
	    }
	    switch(ch)
	    {
	        case '1': 
	            area = l*b;
	            cout<<"Area: "<<area;
	            break;
            case '2':
                peri = 2*(l+b);
                cout<<"Perimeter: "<<peri;
                break;
            case '3':
                diag = sqrt((l*l)+(b*b));
                cout<<"Diagonal: "<<diag;
                break;
            case '4':
                cout<<"Breaking.";
                exit(0);
            default:
                cout<<"Wrong Choice.";
	    }
	    cout<<"\n Want to enter more? (y/n)";
	    cin>>ch1;
	    if(ch1=='y'||ch1=='Y')
	    {
	        cout<<"Again enter choice (1-4): ";
	    }
	}while(ch1=='y'||ch1=='Y');
	
	return 0;
}
