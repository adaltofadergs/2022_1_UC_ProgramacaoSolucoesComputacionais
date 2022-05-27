
package projeto_heranca;


public class Pessoa {
    
    private String nome;
    private int idade;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void saidaDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        
        
    }
    
    
}
