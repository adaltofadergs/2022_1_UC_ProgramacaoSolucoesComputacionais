public class Main{
	// Função que recebe um valor como parâmetro e retorna um valor
	public static double aoQuadrado( double valor ){
		double result = valor * valor;
		return result;
	}


	// Funções que NÃO recebem parâmetro e retornam um valor
	public static double getPi(){
		return 3.14;
	}
    
	public static boolean adaltoTemFilhos(){
		return false;
	} 
    
    
    
	// Função que NÃO recebe parâmetro e  NÃO retorna nada
	public static void imprimirPI( ){
		System.out.println( "Valor do PI: " + getPi() );
	}
    
    
	// Funções que recebem parâmetros e  NÃO retornam nada
	public static void imprimirAreaDoCirculo( double raio ){
		double area = getPi() * ( raio * raio );
		System.out.println( "Área do Círculo com raio " + raio + " é: " + area );
	}
    
	public static void imprimirMeusDados( String nome, int idade, double altura, boolean temFilhos ){
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("altura: " + altura);
		if( temFilhos  ){
		System.out.println("Tem filhos? Sim");
		}else{
		System.out.println("Tem filhos? Não");
		}
		
	}
    

	public static void main(String[] args) {

		System.out.println("Resultado de 3 ao quadrado: " + aoQuadrado( 3 ) ) ;
	//	System.out.println("PI: " + getPi()  ) ;
		imprimirPI();
		imprimirAreaDoCirculo( 3.0 );
		imprimirMeusDados("Adalto Selau", 36, 1.8, adaltoTemFilhos() );
		imprimirMeusDados("João da Silva", 25, 1.75, false );
		
		if( adaltoTemFilhos() ){
			System.out.println( "O Adalto tem filhos! ");
		}else{
			System.out.println( "O Adalto NÃO tem filhos! ");
		}
		
	}
	
	
}