#include <stdio.h>

struct employee
{
    char    name[30],dest[30];
    int     empId,age;
    int  salary;
};
 
int main()
{

    struct employee emp;
     
  
    printf("Enter name:");   gets(emp.name);
    printf("\nEnter ID:");     scanf("%d",&emp.empId);
    printf("\nEnter age:");    scanf("%d",&emp.age);
    printf("\nEnter designation:"); scanf("%s",&emp.dest);
    printf("\nEnter Salary:");       scanf("%d",&emp.salary);
     
  
    printf("\nEmployee Details");
    printf("\nName of the Employee : %s",emp.name);
    printf("\nID of the Employee : %d",emp.empId);
    printf("\nAge of the Employee : %d",emp.age);
    printf("\nDesignation of the Employee : %s",emp.dest);
    printf("\nSalary of the Employee : %d",emp.salary);
    return 0;
}