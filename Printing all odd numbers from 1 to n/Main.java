#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int i;
  for(i=0;i<=n;i++)
  {
    if(i%2==1)
      printf("%d\n",i);
  }
	return 0;
}