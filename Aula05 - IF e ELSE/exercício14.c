/*
14. O imposto de renda de uma pessoa varia segundo a tabela abaixo.
 --------------------------------------------------------
| Salário                | Alícota | Parcela a descontar |
 ------------------------|---------|---------------------|
| até 1903.98            | isento  |       0.00        	 |
 ------------------------|---------|---------------------|
| de 1903.99 até 2826.65 |   7.5%  |     142.80          |
 ------------------------|---------|---------------------|
| de 2826.66 até 3751.05 |  15.0%  |     354.80          |
 ------------------------|---------|---------------------|
| de 3751.06 até 4664.68 |  22.5%  |     636.13          |
 ------------------------|---------|---------------------|
| acima de 4664.68       |  27.5%  |     869.36          |
 ________________________________________________________

Faça um algoritmo que dado um valor, em reais, correspondente a um salário, 
informe o valor que será recebido (total menos imposto).
*/

#include <stdio.h>

int main()
{
	float salario, imposto;
	printf( "Digite seu salário: ");
   	scanf( "%f" , &salario );
    
        if( salario <= 1903.98 ){
		imposto = 0;
	}else{
		if( salario >= 1903.99  &&  salario <= 2826.65 ){
			imposto = ( salario * 7.5 / 100 ) - 142.80;
		}else{
			if( salario >= 2826.66  &&  salario <= 3751.05 ){
				imposto = ( salario * 15 / 100 ) - 354.80;
			}else{
				if( salario >= 3751.06  &&  salario <= 4664.68 ){
					imposto = ( salario * 22.5 / 100 ) - 636.13;
				}else{
					if( salario > 4664.68 ){
						imposto = ( salario * 27.5 / 100 ) - 869.36;
					}
				}
			}
		} 
	} 	
    
    	if( imposto == 0.0 ){
        	printf("Você está isento de IRPF neste mês!");
    	}else{
        	printf("O valor do imposto é: R$ %.2f", imposto );
    	}
    
    	return 0;
}




/*  Outra forma de fazer a mesma estrutura de IF

   	if( salario <= 1903.98 )
        	imposto = 0;
    	else if( salario >= 1903.99  &&  salario <= 2826.65 )
            	imposto = ( salario * 7.5 / 100 ) - 142.80;
        else if( salario >= 2826.66  &&  salario <= 3751.05 )
        	imposto = ( salario * 15 / 100 ) - 354.80;
        else if( salario >= 3751.06  &&  salario <= 4664.68 )
                imposto = ( salario * 22.5 / 100 ) - 636.13;
        else if( salario > 4664.68)
                imposto = ( salario * 27.5 / 100 ) - 869.36;
            	   
*/