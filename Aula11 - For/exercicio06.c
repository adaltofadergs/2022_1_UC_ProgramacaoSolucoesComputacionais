/******************************************************************************
6. Usando FOR, construa um algoritmo que o usuário informa 5 valores, ao final o 
algoritmo imprime o maior e o menor valor inserido e a média dos valores
*******************************************************************************/

#include <stdio.h>

int main()
{
	int i, min, max, valor, soma=0;
    
	for( i = 1; i <= 5; i++){
		printf( "Digite o %dº valor: " , i);
		scanf("%d", &valor);

		// Na primeira iteração, seta o valor informado, como mínimo e máximo
		if( i == 1 ){
			min = valor;
			max = valor;
		}

		// Verificação do menor
		if( valor < min ){
			min = valor;
		}
        
		// Verificação do maior
	        // 	if( valor > max ){
	        // 	    max = valor;
	        // 	}
		// Verificação de maior, de uma forma alternativa, utilizando operador ternário
		valor > max ? max = valor : 0 ;
        
		soma += valor;
	}
	printf("Mínimo: %d", min);
	printf("\nMáximo: %d", max);
	printf("\nMédia: %.3f", (soma/5.0) );

	return 0;
}
