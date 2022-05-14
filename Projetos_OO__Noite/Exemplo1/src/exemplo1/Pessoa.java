package exemplo1;
import java.util.Scanner;

public class Pessoa {
    
    private String nome;
    private int idade;
    private double salario;
    
    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salário: " + this.salario);
        aumento();
        System.out.println("Novo Salário: " + this.salario);
    }
    
    public void cadastrar(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        this.nome = ler.nextLine();
        System.out.println("Informe a idade: ");
        this.idade = ler.nextInt();
        System.out.println("Informe o salário: ");
        this.salario = ler.nextFloat();
        System.out.println(" ### Dados inseridos!###");

    }
    
    private void aumento(){
        this.salario=this.salario*1.1;
    }
    
}
