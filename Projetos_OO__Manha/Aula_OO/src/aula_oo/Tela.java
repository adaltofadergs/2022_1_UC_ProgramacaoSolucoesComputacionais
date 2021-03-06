package aula_oo;

/**
 *
 * @author adalto.selau
 */

import pacote02.Classe01;
import pacote02.Funcionario;

public class Tela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 12/05/2022
        
        /*
        int idade = 36;
        double y = 1.5;
        String nome = "Adalto";
        boolean temFilhos = true;
        String texto = nome + " - " + idade;
        System.out.println( texto );
        */
        
        Cidade c1 = new Cidade();
        c1.id = 1;
        c1.nome = "Porto Alegre";
        
        c1.imprimir();
        
        System.out.println("----------------------");
        
        Pessoa p1 = new Pessoa();
        p1.id = 1;
        p1.nome = "João da Silva";
        p1.fone = "(51) 98765-4321";
        p1.cidade = c1;
        
        Pessoa p2 = new Pessoa("Maria Souza");
        p2.cidade = new Cidade("Capão da Canoa");
//        p2.cidade.nome = "Capão da Canoa";
        p2.imprimir();
        
        Pessoa p3 = new Pessoa("José", "(51) 1234-5678");
        p3.cidade = p2.cidade;
        p3.imprimir();
        
        
        Categoria cat1 = new Categoria();
        cat1.id = 1;
        cat1.nome = "Bebidas";
        
        Produto prod1 = new Produto("Caca-Cola", 6.99, 100);
        prod1.categoria = cat1;
        
        prod1.imprimir();
        
        
        
        
        // 13/05/2022
        System.out.println("-------13/05/2022----");
        
        Classe01 cla01 = new Classe01();
        cla01.xPublico = 0;
 //       cla01.xProtegido = 0;
        
        Funcionario f1 = new Funcionario();
        
        f1.setSalario( 1500.0 );
        
        System.out.println("Valor atual do salário: " 
                + f1.getSalario() );
 
        
        
    }
    
}
