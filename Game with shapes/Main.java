#include<iostream>
using namespace std;
int main()
{
	float rad,ac,as,s,d;
  cin>>rad>>s;
  as=s*s;
  ac=(3.14)*rad*rad;
  d=2*rad;
  if(ac<as && d<=s)
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
}
