
package aula32;
import java.util.Scanner;

public class Aula32 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, registro;
        int idade;
        double salario;
        System.out.println("Informe o nome");
        nome = input.nextLine();
        System.out.println("Informe a idade:");
        idade = input.nextInt();
        System.out.println("Informe o salario:");
        salario = input.nextDouble();
        System.out.println("Informe o registro:");
        input.nextLine();
        registro = input.nextLine();       
        
        Professor prof = new Professor(nome,salario,idade,registro);
        prof.dados();
        
        Aluno al = new Aluno("Maria",1500,25,"202201456");
        al.dados();
        
        
        
        
    }
    
}
