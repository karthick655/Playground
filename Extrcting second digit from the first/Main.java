#include <stdio.h>
int main() {
	//Type your code
  int n,b=0;
  scanf("%d",&n);
  while(n>0)
  {
    if(n<100)
    {
      b=n;
      break;
    }
    n=n/10;
  }
  printf("%d",b%10);
  
	return 0;
}