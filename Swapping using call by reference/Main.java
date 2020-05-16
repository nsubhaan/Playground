#include <stdio.h>
void swap(int*, int*); //Swap function declaration

int main()
{
   int a, b;

   //printf("Enter the value of x and y\n");
   scanf("%d%d",&a,&b);

   printf("Before swapping a= %d and b=%d\n", a, b);

   swap(&a, &b);

   printf("After swapping a= %d and b=%d", a, b);

   return 0;
}
//Swap function definition
void swap(int *x, int *y)
{
   int t;

   t  = *y;
   *y = *x;
   *x = t;
}