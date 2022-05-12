package aula_oo;

/**
 *
 * @author adalto.selau
 */
public class Cidade {
    
    public int id;
    public String nome;
    
    public Cidade(){
        
    }
    
    public Cidade(String nome){
        this.nome = nome;
    }
    
    public void imprimir(){
        System.out.println("Código: " + this.id );
        System.out.println("Nome: " + this.nome );
    }
    
}
