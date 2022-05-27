
package aula32;


public class Aluno extends Pessoa{
    private String matricula;
    
    public Aluno(String nome, double salario, int idade,String matricula){
        super(salario,nome,idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    @Override
    public void dados(){
        super.dados();
        System.out.println("MAtricula: " + getMatricula());
        
    }
    
}
