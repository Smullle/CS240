#include <stdio.h>
#include <fcntl.h>

main ()
{
	char buffer[10],file[30];	
	int fd, n;
	scanf("%s",file);
	fd = open(file,O_RDONLY);

	do {
		n=read(fd, buffer, 10); /*Read 10 chars from file*/
		write(1, buffer, n);	/*Write chars to text terminal*/	
	} while (n==10);		/*Keep reading until n<10 */
}
