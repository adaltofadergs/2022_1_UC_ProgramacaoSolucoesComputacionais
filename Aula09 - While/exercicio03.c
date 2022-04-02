/******************************************************************************
Utilizando Do While, construa um algoritmo que o usuário informa vários numeros
que são somados pelo algoritmo.

Quando o usuário informar 0, então o algoritmo é finalizado, imprimindo a soma
de todos números informados.

*******************************************************************************/
#include <stdio.h>

int main()
{

    int valor, soma = 0;
    
    do{
        printf("Digite um valor inteiro ( 0 encerra o programa ): ");
        scanf("%d", &valor);
        soma += valor;
    }while( valor != 0 );
    
    printf( "A soma dos valores informados é: %d", soma);

    return 0;
}
