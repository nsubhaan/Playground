#include<stdio.h>
int main()
{
int arr[100][100];
  int n=0,i,j,sum=0,sum1=0,sum2=0,sum3=0,flag=1;
scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
    scanf("%d",&arr[i][j]);
      if(i==j){
      sum +=arr[i][j];
      }
    }
  }
  for(i=0;i<n;i++)
  {
  for(j=0;j<n;j++){
    sum1 +=arr[i][j];
    sum2 +=arr[j][i];
    if(i+j+1==n)
    {
      sum3 +=arr[i][j];
    }
    }
    if(sum !=sum1||sum2 !=sum){
      flag=0;
      break;
    }
    sum1=0;
    sum2=0;
  }
  if(flag==1&&sum==sum3){
    printf("Yes");
  }
  else{
    printf("No");
    }
}