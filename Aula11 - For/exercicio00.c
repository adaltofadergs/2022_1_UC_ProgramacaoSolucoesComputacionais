/******************************************************************************
Construir um algoritmo que imprime os números de 1 a 10
*******************************************************************************/

#include <stdio.h>


int main()
{
	int i = 1;
   
//    while( i <= 10 ){
//        printf( "%d \n", i );
//        i ++;
//    }
	// Exemplo utilizando IF com incremento
	for( i = 1; i <= 10 ; i++){
		printf( "%d \n", i );
	}
    
	printf("------------\n");
	// Exemplo utilizando IF com decremento
//    	int j;
	for( int j=10 ; j>0 ; j--){
		printf( "%d \n", j );
	}

	return 0;
}
