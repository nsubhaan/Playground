#include<iostream>
using namespace std;
struct College{
  char name[100];
  char city[100];
  int yr;
  float per;
};
int main()
{
  int n;
  cout << "Enter the number of colleges";
  cin >> n;
  struct College s[n];
  for(int i=0 ; i<n ; i++){
    cout << "\nEnter the details of college " << (i+1);
    cout << "\nEnter name";
    cin >> s[i].name;
    cout << "\nEnter city";
    cin >> s[i].city;
    cout << "\nEnter year of establishment";
    cin >> s[i].yr;
    cout << "\nEnter pass percentage";
    cin >> s[i].per;
  }
  cout << "\nDetails of colleges";
  for(int i=0 ; i<n ; i++){
    cout << "\nCollege:" << (i+1);
    cout << "\nName:" << s[i].name;
    cout << "\nCity:" << s[i].city;
    cout << "\nYear of establishment:" << s[i].yr;
    cout << "\nPass percentage:" << s[i].per;
  }
  return 0;
}