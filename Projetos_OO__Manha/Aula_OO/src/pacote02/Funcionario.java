package pacote02;

/**
 *
 * @author adaltoss
 */
public class Funcionario {
    
    private double salario;
    
    // Método Acessor do atributo salario
    public double getSalario(){
        return this.salario;
    }
        
    // Método Modificador do atributo salario
    public void setSalario(double salario){
        if( salario >= 1212.0 ){
            this.salario = salario;
        }else{
            System.out.println("Valor menor que o permitido");
        }
    }
    
}
