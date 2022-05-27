package aula_heranca;


import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class Veiculo {
    private int id;
    protected String modelo;
    public int ano;
    
    public Veiculo(){
        
    }

    public Veiculo(String modelo, int ano){
        setId();
        this.modelo = modelo;
        this.ano = ano;
    }    
    
    public int getId(){
        return this.id;
    }
    
    public void setId(  ){
        this.id = (int) ( Math.random() * 1000 );
    }
    
    public void acelerar(){
        System.out.println("Acelerou!!!");
        JOptionPane.showMessageDialog(null, 
                "O veículo " + this.id + " - " + this.modelo + " acelerou!");
    } 
}
