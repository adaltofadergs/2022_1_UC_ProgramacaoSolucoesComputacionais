/******************************************************************************
1. Some os números de 1 a 100 e imprima o valor.
*******************************************************************************/

#include <stdio.h>

int main()
{
	int i, soma = 0;
	for( i=1 ; i <= 100 ; i++){
 		soma += i;
	}
	printf("Soma de 1 a 100: %d", soma);

	return 0;
}