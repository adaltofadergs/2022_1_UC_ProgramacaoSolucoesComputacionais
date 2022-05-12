package aula_oo;

/**
 *
 * @author adalto.selau
 */
public class Categoria {
    
    public int id;
    public String nome;
    
    public Categoria(){
        
    }
    
    public Categoria(String nome){
        this.nome = nome;
    }
    
    public void imprimir(){
        System.out.println("Código: " + this.id );
        System.out.println("Nome: " + this.nome );
    }
    
}
