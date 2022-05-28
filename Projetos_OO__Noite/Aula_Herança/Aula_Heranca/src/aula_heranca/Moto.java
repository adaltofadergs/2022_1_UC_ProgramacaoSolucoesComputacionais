package aula_heranca;

import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class Moto extends Veiculo{
    
    public int cilindradas;
    
    public Moto(){
        super();
    }
    
    
    public Moto(String modelo, int ano){
        super(modelo, ano);
    }
    
    public Moto(String modelo, int ano, int cilindradas){
        super(modelo, ano);
        this.cilindradas = cilindradas;
    }
    
    

    @Override
    public void acelerar() {
         JOptionPane.showMessageDialog(null, 
                "A moto " + getId() + " - " + this.modelo + " acelerou!");
    }

    @Override
    public void cadastrar() {
        String texto = "";
        
        try{
            texto += "Modelo: " + this.modelo;
            texto += "\nAno: " + this.ano;
            texto += "\nCilindradas: " + this.cilindradas;
            JOptionPane.showMessageDialog(null, texto);
        }catch(Exception erro){
            System.out.println("Erro: " + erro.toString() );
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nCilindradas: " + this.cilindradas; 
    }
    
    
    
    
   
    
}
