#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int i,count=1;
  for(i=1;i<=n;i++)
  {
    count*=i;
  }
  printf("%d",count);
	return 0;
}