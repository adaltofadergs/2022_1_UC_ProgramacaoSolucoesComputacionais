package exemplo1;

import banco.Conta;
/**
 *
 * @author flavio.treib
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.cadastrar();
        p1.exibirDados();
        
        Cidade c1 = new Cidade();
        c1.nome = "Porto Alegre";
        c1.populacao = 1500000;
        
        
        Cidade c2 = new Cidade();
        c2.nome = "Porto Alegre";
        c2.populacao = 1500000;
        
        Conta conta01 = new Conta();
        conta01.tipo = "Corrente";
        conta01.depositar( 100.90 );
        
        System.out.println("Saldo: " 
                + conta01.getSaldo() );
        conta01.setSaldo( 1000000 );
        
        System.out.println("Novo Saldo: " 
                + conta01.getSaldo() );

 //       conta01.saldo = -1000000;
        
    }
    
}
