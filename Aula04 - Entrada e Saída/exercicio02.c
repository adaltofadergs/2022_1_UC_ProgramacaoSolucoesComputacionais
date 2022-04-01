// Leia uma temperatura dada na escala Celsius (C) e imprima o equivalente em Fahrenheit (F). 
// (Fórmula de conversão: F = 9/5 * C + 32).

#include <stdio.h>

int main(){
	float c, f;
	printf( "Digite a temperatura em graus Celsius: " );
	scanf( "%f", &c);
	f =  1.8 * c  + 32.0 ;
	printf( "A conversão de %fºC em Fahrenheit é: %f" , c , f);

	return 0;
}
