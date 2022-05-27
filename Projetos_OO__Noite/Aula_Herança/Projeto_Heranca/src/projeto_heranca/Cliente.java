
package projeto_heranca;

public class Cliente extends Pessoa{
    private double valorDivida;
    private int anoNascim;

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascim() {
        return anoNascim;
    }

    public void setAnoNascim(int anoNascim) {
        this.anoNascim = anoNascim;
    }
    @Override
    public void saidaDados(){
        super.saidaDados();
        System.out.println("MAtricula: " + getSexo());
        System.out.println("Gerencia: " + getValorDivida());
        System.out.println("Gerencia: " + getAnoNascim());
        
    }
}
