
package faculdade;
import java.util.Scanner;
import java.util.ArrayList;

public class Faculdade {

    
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       ArrayList<Professor> listaProfessores = new ArrayList();
       int menu;
       String nome,email;
       double salario;
       do{
           System.out.println("1 - Cadastra Professor");
           System.out.println("2 - Cadastra Aluno");
           System.out.println("3 - Lista Professores");
           System.out.println("4 - Lista Alunos");
           System.out.println("5 - Excluir Professor");
           System.out.println("6 - Sair");
           System.out.print("Digite sua opção: ");
           menu=ler.nextInt();
           switch(menu){
               case 1:
                   System.out.println("Nome");
                   ler.nextLine();
                   nome = ler.nextLine();
                   System.out.println("Email: ");
                   email = ler.nextLine();
                   System.out.println("Salário:");
                   salario = ler.nextDouble();
                   Professor professor = new Professor(nome, email, salario);
                   professor.cadastrar();
         //          listaProfessores.add(professor);
                   System.out.println("Cadastrado com sucesso!");
               break;
               case 2:
               break;
               case 3:
                   System.out.println("Lista de Professores: ");
                   listaProfessores = Professor.getProfessores();
                   for(Professor p: listaProfessores ){
                       p.dados();
                   }
               break;
               case 4:
               break;
               case 5:
               break;
               case 6:
               break;
            }
        }while(menu!=6);
    }
    
}
