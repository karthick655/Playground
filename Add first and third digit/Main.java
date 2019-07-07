#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int b=a;
  int c=b%10;
  int d=(a/10)/10;
  int e=c+d;
  printf("%d",e);
  return 0;
}