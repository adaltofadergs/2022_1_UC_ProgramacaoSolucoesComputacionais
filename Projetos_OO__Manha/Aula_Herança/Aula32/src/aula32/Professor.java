
package aula32;


public class Professor extends Pessoa{
    private String registro;
    
    public Professor(String nome, double salario, int idade,String registro){
        super(salario,nome,idade);
        this.registro = registro;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
    
    @Override
    public void dados(){
        super.dados();
        System.out.println("Registro: " + getRegistro());
        
    }
}
