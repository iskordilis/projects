#include <stdio.h>
#include <malloc.h>



int main(int argc , char **argv);



int main( int argc , char ** argv){
	char *s = malloc(30 * sizeof (char));
	for (int x=0; x<=10; x++) {
		printf ("%d\n",x);
	}
	printf("%s","Hello C from  Visual Studio\n ");
	
	free(s);
	
	
}