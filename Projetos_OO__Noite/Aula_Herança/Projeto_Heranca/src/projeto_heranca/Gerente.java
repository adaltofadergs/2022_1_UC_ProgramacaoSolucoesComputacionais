
package projeto_heranca;


public class Gerente extends Empregado{
    private String nomeGerencia;

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }
    
    @Override
    public void saidaDados(){
        super.saidaDados();
        System.out.println("MAtricula: " + getMatricula());
        System.out.println("Gerencia: " + getNomeGerencia());
        valorInss();
    }
    
}
