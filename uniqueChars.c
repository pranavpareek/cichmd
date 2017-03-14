/*
	Author: Pranav Pareek
	Email: me@pranavpareek.com
*/

#include <stdio.h>

//returns the number of unique characters found
int uniqueChars(char *str)
{
	int a[256];
	int uniqueCharFound = 0;
	while(*str)
	{
		if(a[*str] != 1)
		{
			a[*str] = 1;
			uniqueCharFound++;
		}
		*(str++);
	}
	return uniqueCharFound;
}

void main() 
{
	printf("Total number of unique chars: %d\n", uniqueChars("iceman"));
}
