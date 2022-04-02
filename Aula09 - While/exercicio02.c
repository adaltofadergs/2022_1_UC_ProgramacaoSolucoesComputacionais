/******************************************************************************
Foi realizada uma pesquisa de algumas características físicas da população de uma certa
região, a qual coletaram os seguintes dados referentes a cada habitante para serem
analisados:
    sexo (masculino e feminino)
    idade
Faça um algoritmo que determine e escreva:
    a maior idade dos habitantes;
    a quantidade de indivíduos do sexo feminino cuja idade está entre 18 e 35 anos, inclusive;

O final do conjunto de habitantes é reconhecido pelo valor -1 informado como
idade.
*******************************************************************************/
#include <stdio.h>

int main()
{
    int feminino18a35 = 0, maiorIdade = 0;
    int idade = 0, sexo;
    
//  while( idade >= 0  )
    while( idade != -1  ){
        printf( "Digite a idade do indivíduo ( -1 para encerrar o algoritmo ): ");
        scanf("%d" , &idade );
        
        if( idade == -1){
            break;
        }
        
        printf( "1 - Feminino\n");
        printf( "2 - Masculino\n");
        printf( "Digite o valor referente ao sexo do indivíduo: ");
        scanf("%d" , &sexo );
        
        if( sexo == 1 && idade >= 18 && idade <= 35 ){
            feminino18a35 ++;
        }
        
        if( idade > maiorIdade ){
            maiorIdade = idade;
        }
    }
    
    printf("O maior valor informado de idade foi %d" , maiorIdade );
    printf("\nForam informados %d indivíduos do sexo feminino entre 18 e 35 anos", feminino18a35);

    return 0;
}
