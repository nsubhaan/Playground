#include <iostream>
using namespace std;
int main()
{
  //cout << "Enter the number of students: ";
  int numberOfStudents;
  cin >> numberOfStudents;
  double score = -1;
  for (int i = 0; i < numberOfStudents; i++)
  {
    //cout << "Enter a student score: ";
    int score1;
    cin >> score1;
    if (score < score1)
    {
      score = score1;
    }
  }
  cout << score;
    cin.clear();
    cin.ignore();
    getchar();
  return 0;
}