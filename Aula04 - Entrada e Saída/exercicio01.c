// 1. Escreva um algoritmo para calcular o valor de y como função de x, 
// segundo a função y(x) = 3x + 2, num domínio real.


// Comentário de uma linha 
/* 
 Comentário 
 em 
 bloco
*/

#include <stdio.h>

int main(){

	int x;
	int resultado;
	printf( "Digite o valor de X: " );
	scanf("%d", &x);
	resultado =  (3 * x)  + 2;
	printf( " O resultado da função 3x + 2 , com x valendo %d é: %d" , x , resultado );

	return 0;
}