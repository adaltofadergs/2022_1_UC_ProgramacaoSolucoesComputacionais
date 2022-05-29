public class Main
{
    // Função sem retorno e sem parâmetros
    public static void imprimirPI( ){
        System.out.println( "Valor do PI: " + getPI() );
    }
    
    
    // Função com retorno e sem parâmetros
    public static double getPI(){
        return 3.14;
    }
    
    // Função com retorno e com parâmetros
    public static double getAreaCirculo( double raio){
        double area = getPI() * ( raio * raio );
        return area;
    }
    
    // Função sem retorno e com parâmetros
    public static void imprimirAreaRetangulo( double largura, double altura){
        double area = largura * altura;
        System.out.println( "Área do retângulo com largura "+largura+" e altura " + altura + " é de: " + area);
    }
    
    public static void imprimirMeusDados( String nome, int idade, double altura, boolean temFilhos ){
        System.out.println( "\n\nNome: " + nome );
        System.out.println( "Idade: " + idade);
        System.out.println( "Altura: " + altura);
        
        if( temFilhos  ){
            System.out.println( "Tem filhos? SIM");
        }else{
            System.out.println( "Tem filhos? NÃO");
        }
    
    }
    
	public static void main(String[] args) {
		imprimirPI();
		System.out.println( "Área do Círculo com raio 2: " + getAreaCirculo( 2 ) ) ;
		imprimirAreaRetangulo( 2 , 3);
		imprimirMeusDados( "Adalto Selau", 36 , 1.8 , false );
	}
	
}