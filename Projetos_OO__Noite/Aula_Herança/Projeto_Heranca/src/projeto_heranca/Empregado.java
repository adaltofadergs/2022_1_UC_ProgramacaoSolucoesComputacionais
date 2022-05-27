
package projeto_heranca;


public class Empregado extends Pessoa {
    private double salario;
    private String matricula;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
     public void valorInss(){
         System.out.println("VAlor do INSS: " + getSalario()*0.11);
     }
}
