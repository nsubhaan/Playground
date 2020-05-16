#include <iostream>
struct student
{
    std::string name;
    int roll;
    float marks;
};
int main() 
{
  struct student s1;
  std::cout << "\nStudent Details\n";
  getline(std::cin,s1.name);
  std::cin >> s1.roll;
  std::cin >> s1.marks;
  
  std::cout << "Name: " << s1.name << std::endl;
  std::cout << "Roll: " << s1.roll << std::endl;
  std::cout << "Marks: " << s1.marks;
}