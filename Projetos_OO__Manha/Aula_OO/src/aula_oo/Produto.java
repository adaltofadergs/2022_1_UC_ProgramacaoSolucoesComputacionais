package aula_oo;

/**
 *
 * @author adalto.selau
 */
public class Produto {
    
    public int id;
    public String nome;
    public double preco;
    public double quantidade;
    public Categoria categoria;
    
    public Produto(){
        
    }
    
    public Produto(String nome){
        this.nome = nome;
    }
    
    public Produto(String nome, double preco, double qtd){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = qtd;
        int id = (int) ( Math.random() * 1000 );
        this.id = id;
    }
    
    public void imprimir(){
        System.out.println("Código: " + this.id );
        System.out.println("Nome: " + this.nome );
        System.out.println("Preço: " + this.preco );
        System.out.println("Quantidade: " + this.quantidade );
        System.out.println("Categoria: " + this.categoria.nome );
    }
    
}
