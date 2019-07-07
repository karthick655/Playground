#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int i,j,sum=0;
  for(i=0;i<n;i++)
  {
    for(j=sum;j<1000;j++)
    {
      if(j%2==1)
      {
        printf("%d\n",j);
        sum=j+1;
        break;
      }
    }
  }
  
	return 0;
}