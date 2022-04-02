/*
8. Escreva um algoritmo onde o usuário informe a nota de uma aluno (de 0 a 100).
• Nota >= 60: mensagem de Aprovado
• Nota >= 20:mensagem de Recuperação, mas pode fazer recuperação 
• Nota de zero a < 20: mensagem de Reprovado
*/

#include <stdio.h>

int main()
{
    int nota;
    printf("Digite a sua nota: ");
    scanf( "%d" , &nota );
    
    if( nota >= 60 )
        printf( "Aprovado!");
    else
        if( nota < 20 )
            printf("Você foi reprovado!");
        else
            printf("Você está reprovado, mas poderá fazer a recuperação!");
       
    
    //limpa o buffer do teclado;
    fflush(stdin);
    // Espera que alguma tecla seja pressionada
    getchar();
    return 0;
}
