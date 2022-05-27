
package projeto_heranca;


public class Vendedor extends Empregado{
    private double valorVendas;
    private int qntVendas;

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }
    
    public void saidaDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalario());
        System.out.println("MAtricula: " + getValorVendas());
        System.out.println("Gerencia: " + getQntVendas());
        valorInss();
    }
}
