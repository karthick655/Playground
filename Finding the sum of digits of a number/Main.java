#include <stdio.h>
int main() {
	//Type your code
  int a;
  scanf("%d",&a);
  int b,sum=0;
  while(a>0)
  {
    b=a%10;
    sum+=b;
    a=a/10;
  }
  printf("%d",sum);
	return 0;
}