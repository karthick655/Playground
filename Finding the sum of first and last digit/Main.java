#include <stdio.h>
int main() {
	//Type your code
  int n,b,c=0;
  scanf("%d",&n);
  b=n%10;
  while(n>0)
  {
    n=n/10;
    if(n<10)
    {
      c=n;
      break;
    }
  }
  int d=b+c;
  printf("%d",d);
	return 0;
}