package aula_heranca;

import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class Carro extends Veiculo {
    
    public int qtdPortas;
    private boolean temTetoSolar;
    
    public Carro(){
        
    }
    
    public Carro(String modelo, int ano, int qtdPortas, boolean tetoSolar){
        super(modelo, ano);
        this.qtdPortas = qtdPortas;
        this.temTetoSolar = tetoSolar;
        
    }

    @Override
    public void acelerar() {
   //     super.acelerar(); 
        String texto = "Id: " +this.getId();
        texto += "\nModelo: " + this.modelo;
        texto += "\nAno: " + this.ano;
        texto += "\nPortas: " + this.qtdPortas;
        texto += "\nTem teto solar: " + this.temTetoSolar;
        JOptionPane.showMessageDialog(null, texto);
    }
    
    
    
    
}
