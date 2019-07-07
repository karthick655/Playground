#include <stdio.h>
int main() {
	//Type your code
  int n,temp;
  scanf("%d",&n);
  int i,c=0;
  temp=n;
  while(temp>0)
  {
    int b=temp%10;
    int a=0;
    a=b*b*b;
    c+=a;
    temp/=10;
  }
  if(c==n)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
  
	return 0;
}