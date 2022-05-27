package aulaheranca;

import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class Moto extends Veiculo{
    public int cilindradas;
    public boolean partidaEletrica;
    
    public Moto(){
        super();
    }
    
    public Moto( String marca, int ano, int cilindradas, boolean partida){
        super(marca, ano);
        this.cilindradas = cilindradas;
        this.partidaEletrica = partida;
    }

    @Override
    public void acelerar() {
        JOptionPane.showMessageDialog(null, "A moto " + this.marca + 
                "\n de " + this.cilindradas + " cilindradas acelerou!");
    }

    @Override
    public void cadastrar() {
        String texto = "";
        
        try{
            
            texto += "Marca: " + this.marca;
            texto += "\nAno: " + this.ano;
            texto += "\n:Cilindradas " + this.cilindradas;
            if( this.partidaEletrica ){
                texto += "\nPartida elétrica: Tem";
            }else{
                texto += "\nPartida elétrica: Não tem";
            }
            
            JOptionPane.showMessageDialog(null, texto);  
        }catch(Exception e){
            System.out.println("Erro: " + e.toString() );
        }
    }  
    
    public void passarNoCorredor(Carro c1, Carro c2){
        String texto = "A moto " + this.marca + " passou entre os carros " + c1.marca + " e " + c2.marca;
        JOptionPane.showMessageDialog(null, texto);
    }

    @Override
    public String toString() {
        return super.toString() + "\nCilindradas: " + this.cilindradas + "\nPartida etétrica: " + this.partidaEletrica;
    }
    
    
}
