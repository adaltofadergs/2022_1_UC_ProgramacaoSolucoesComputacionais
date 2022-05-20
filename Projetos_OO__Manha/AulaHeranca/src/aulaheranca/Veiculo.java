package aulaheranca;

import javax.swing.JOptionPane;



/**
 *
 * @author adaltoss
 */
public class Veiculo {
    // Atributos
    private int id;
    protected String marca;
    public int ano;
    
    
    // Métodos Construtores
    public Veiculo(){
        
    }
    
    public Veiculo(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }
    
    public Veiculo(String marca, int ano, int id){
        this.marca = marca;
        this.ano = ano;
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(){
        this.id = (int) ( Math.random() * 1000 );
    }
    
    
    public void acelerar(){
        System.out.println("O veículo acelerou!");
        JOptionPane.showMessageDialog(null, 
                        "O veículo " + 
                        this.marca + 
                        " acelerou!");
    }
     
    
}








