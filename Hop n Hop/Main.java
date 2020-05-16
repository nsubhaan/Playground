#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,l,m,j,r,z,f;
  int a=3,b=4;
  cin>>x>>y;
  l=(x-a);
  m=(y-b);
  j=l*l;
  r=m*m;
  z=j+r;
  f=sqrt(z);
  cout<<f;
}