#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,i,y;
  double inter,amount,disc,final;
  cin>>p>>i>>y;
  inter=(p*i*y)/100;
  amount=p+inter;
  disc=inter*2/100;
  final=p+inter-disc;
  cout<<inter<<endl;
  cout<<amount<<endl;
  cout<<disc<<endl;
  cout<<final<<endl;
  return 0;
}