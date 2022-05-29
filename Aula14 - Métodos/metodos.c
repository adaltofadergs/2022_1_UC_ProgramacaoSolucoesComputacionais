#include <stdio.h>
#include <stdlib.h>

/*
tipoDeRetorno nomeDaFuncao( tipoDoParametro1 nomeDoParametro1 , tipoDoParametro2 nomeDoParametro2 , tipoDoParametroN nomeDoParametroN){
    conteúdo da função
}
*/
void menu(  ){
    printf("\n ------Calculadora----- ");
    printf("\n| 1 - Somar             |");
    printf("\n| 2 - Subtrair          |");
    printf("\n| 3 - Multiplicar       |");
    printf("\n| 4 - Dividir           |");
    printf("\n| 0 - Sair              |");
    printf("\n -----------------------");
}

int lerOpcao( ){
    int opcao;
    printf("\nDigite a sua opção: ");
    scanf("%d", &opcao);
    return opcao;
}

int lerValor( int posicao ){
    int valor;
    printf("\nDigite a %dº valor: ", posicao);
    scanf("%d", &valor);
    return valor;
}



// Função que recebe 2 parâmetros e retorna um valor
int somar( int valor1, int valor2 ){
    int resultado = valor1 + valor2;
    return resultado;
}

int subtrair(int valor1, int valor2 ){
   return ( valor1 - valor2 );
}

int multiplicar(int valor1, int valor2 ){
   return ( valor1 * valor2 );
}

float dividir(int valor1, int valor2 ){
   return ( valor1 / valor2 );
}


int main()
{
    int op, valor1, valor2;
    float result;
    do{
        menu();
        op = lerOpcao();
        if( op == 0 ){
            printf( "\nPrograma Finalizado! ");
        }else{
            
            if( op > 0 && op < 5){
                valor1 = lerValor( 1 );
                valor2 = lerValor( 2 );
            }
            
            switch( op ){
                case 1:
                    result = somar( valor1 , valor2 );
                    break;
                case 2:
                    result = subtrair( valor1 , valor2 );
                    break;
                case 3:
                    result = multiplicar( valor1 , valor2 );
                    break;
                case 4:
                    result = dividir( valor1 , valor2 );
                    break;
                default:
                    printf("\nOpção Inválida!");
            }
            if( op > 0 && op < 5){
                printf( "Resultado: %.3f", result );
            }
        }
    }while( op != 0 );
    return 0;
}