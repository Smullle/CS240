#include <stdio.h>
main()
{
	char name[30];
	int age;
	int n;

	printf("What's your name and age?\n");
	scanf("%s %d", name, &age);
	printf("Hello %s, you are %d years old\n", name, age);
}
