#include <stdio.h>
int main() {
	//Type your code
  int n,temp;
  scanf("%d",&n);
  int i,j,c=0;
  temp=n;
  while(temp>0)
  {
    int count=1;
    int b=temp%10;
    for(j=1;j<=b;j++)
    {
      count*=j;
    }
    c+=count;
    temp/=10;
  }
  if(c==n)
    printf("Yes");
  else
    printf("No");
    
	return 0;
}