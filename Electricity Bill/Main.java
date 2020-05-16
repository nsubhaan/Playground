#include<iostream>
using namespace std;
int main()
{
	int unit;
  	float amt;
  	cin>>unit;
   	if(unit<=200)
    amt=0.5*unit;
    else if (unit>200 && unit<=400)
       amt=(0.65*unit)+100;
   	else if (unit>400 && unit<=600) //If the unit is less than or equal600
  		amt=(0.80*unit)+200;
	else
  		amt=(1.25*unit)+425;
 cout<<"Rs."<<int(amt);
return 0;
}  
