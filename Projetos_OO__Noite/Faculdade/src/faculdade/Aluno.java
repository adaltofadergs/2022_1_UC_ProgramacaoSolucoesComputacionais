package faculdade;
public class Aluno extends Pessoa{
    private String matricula;    
    public Aluno(String nome, String email, String matricula){
        super(nome, email);
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
        System.out.println("Matricula: " + getMatricula());
    }
}
