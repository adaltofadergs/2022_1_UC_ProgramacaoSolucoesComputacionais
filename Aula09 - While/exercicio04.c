/******************************************************************************
Faça um programa que leia o código dos produtos pedidos e as quantidades desejadas;
calcule e mostre o valor a ser pago por produto (preço * quantidade) e o total do pedido.
Considere que o cliente deve informar quando o pedido deve ser encerrado.

Produto             |  Código   |   Preço (unitário)
------------------------------------------------------
Cachorro quente     |    1      |     R$ 1,50
Hamburger           |    2      |     R$ 2,00
Cheeseburger        |    3      |     R$ 2,50
Eggcheeseburger     |    4      |     R$ 3,00
Refrigerante        |    5      |     R$ 1,50

*******************************************************************************/
#include <stdio.h>

int main()
{
    float total = 0, subtotal;
    int continuar, qtd, codigo; 
    do{
        printf("1 - Cabhorro Quente \n");
        printf("2 - Hamburger       \n");
        printf("3 - Cheeseburger    \n");
        printf("4 - Eggcheeseburger \n");
        printf("5 - Refrigerante    \n");
        printf("Digite o código do Produto: ");
        scanf("%d", &codigo);
        printf("Digite a quantidade do Produto: ");
        scanf("%d", &qtd);
        switch( codigo ){
            case 1:
                subtotal = qtd * 1.5;
                break;
            case 2:
                subtotal = qtd * 2.0;
                break;
            case 3:
                subtotal = qtd * 2.5;
                break;
            case 4:
                subtotal = qtd * 3.0;
                break;
            case 5:
                subtotal = qtd * 1.5;
                break;
            default: 
                printf("Código de produto inesistente!");
        }
        printf( "\nTotal do produto %d é: %.2f", codigo, subtotal);
        total += subtotal;
        printf( "\nTotal do pedido até agora: %.2f", total);
        printf( "\nDeseja continuar o pedido? ( 1- SIM | 0- Não) ");
        scanf("%d", &continuar);
    }while( continuar != 0 );
    return 0;
}
