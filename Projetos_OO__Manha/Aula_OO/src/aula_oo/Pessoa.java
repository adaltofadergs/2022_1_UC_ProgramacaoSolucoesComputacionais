package aula_oo;

/**
 *
 * @author adalto.selau
 */
public class Pessoa {
    
    public int id;
    protected String nome;
    public String fone;
    public Cidade cidade;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.fone = telefone;
        int id = (int) ( Math.random() * 1000 );
        this.id = id;
    }
    
    public void imprimir(){
        System.out.println("Código: " + this.id );
        System.out.println("Nome: " + this.nome );
        System.out.println("Fone: " + this.fone );
        System.out.println("Cidade: " + this.cidade.nome );
    }
    
}
