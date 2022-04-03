/******************************************************************************

3. Faça um algoritmo que imprima todos os números pares compreendidos entre 85 e 907. O
algoritmo deve também calcular a soma e exibir a quantidade destes valores.

*******************************************************************************/

#include <stdio.h>

int main()
{
	int i, soma = 0, qtd = 0;
    
	for( i = 85 ; i <= 907; i++){
		if( i % 2 == 0 ){
			soma += i;
	 		qtd ++;
	 		printf("%d \n", i);
		}
	}
    
	printf("\n\nSoma: %d", soma);
	printf("\nQuantidade de números impressos: %d", qtd);

	return 0;
}
