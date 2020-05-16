#include<iostream>

using namespace std;

int main()

{

int d1,c1,d2,c2;

cin>>d1>>c1>>d2>>c2;

int D=d1+d2;

int C=c1+c2;

while(C>100)

{

D=D+(C/100);

C=C%100;

break;

};

cout<<D<<"\n"<<C;

return 0;

}
