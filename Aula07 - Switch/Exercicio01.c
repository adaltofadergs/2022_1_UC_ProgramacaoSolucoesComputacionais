/******************************************************************************
Elabore um programa que solicite ao usuário que digite 2 números inteiros e após ele
escolha uma operação à realizar, conforme segue:
A - Adição
S - Subtração
M - Multiplicação
D - Divisão
Mostrar o resultado da operação realizada.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int n1;
    int n2;
    float result = 0;
    char operador;
    printf("Informe o primeiro valor: ");
    scanf("%d", &n1 );
    fflush(stdin);
    printf("Informe o segundo valor: ");
    scanf("%d", &n2 );
    fflush(stdin);
    printf( "A - Adição \n");
    printf( "S - Subtração \n");
    printf( "M - Multiplicação \n");
    printf( "D - Divisão \n");
    printf( "Informe qual operação realizar: ");
    fflush(stdin);
    scanf("%s", &operador);
    fflush(stdin);
    switch( operador ){
        case 'A': 
            result = n1 + n2;
            break;
        case 'S': 
            result = n1 - n2;
            break;
        case 'M': 
            result = n1 * n2;
            break;
        case 'D': 
            result = n1 / n2;
            break;
        default:
            // result = 0 ;
            printf("Operador não encontrado!");
    }
    fflush(stdin);
    printf("Resultado: %f", result);
    return 0;
}
