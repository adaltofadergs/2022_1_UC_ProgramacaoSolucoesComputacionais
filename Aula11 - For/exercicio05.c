/******************************************************************************

5. Escreva um algoritmo que determine o fatorial de um número informado pelo usuário. Para este problema, tem-se
como entrada o valor do número do qual se deseja calcular o fatorial. O fatorial de 0 é
igual a 1. O fatorial de um número N(N!) é definido conforme a seguir:
N! = 1 * 2 * 3 * 4 * ... * (N-1) * N

*******************************************************************************/

#include <stdio.h>

int main()
{
	int i, fatorial = 1, valor;
	
	printf("Digite um valor: ");
	scanf("%d", &valor);
    
	// for(i = valor; i > 0 ; i--){
 	//     fatorial = fatorial * i;
 	// }
    
	for(i = 2; i <= valor ; i++){
		fatorial = fatorial * i;
	}
    
	printf("Resultado de %d!: %d", valor , fatorial);

	return 0;
}
