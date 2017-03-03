/*
	Author: Pranav Pareek
	Email: me@pranavpareek.com
*/
#include <stdio.h>

int setBitCounter(int myint) 
{
	int count = 0, i, mask = 1, res = 0;
	for(i=0; i<8*sizeof(int); i++)
	{
		res =  mask & (myint >> i);
		if(res==1) {
			count++;
		}
	}
	return count;
}

void main() 
{
	printf("%d\n", setBitCounter(15));
}
