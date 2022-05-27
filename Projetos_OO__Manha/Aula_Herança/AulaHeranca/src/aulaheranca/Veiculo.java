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
    
    public void setMarca(String marca){
        if( marca.isEmpty()  || marca.equals( " " )){
            System.out.println("A marca deve ser preenchida corretamente!");
        }else{
            this.marca = marca;
        }
    }
    
    public void acelerar(){
        System.out.println("O veículo acelerou!");
        JOptionPane.showMessageDialog(null, "O veículo " + this.marca + " acelerou!");
    } 
    
    public void cadastrar(){
        String texto = "";
        
        try{
            
            texto += "Marca: " + this.marca;
            texto += "\nAno: " + this.ano;
            JOptionPane.showMessageDialog(null, texto);  
            
        }catch(Exception e){
            System.out.println("Erro: " + e.toString() );
        }
        
    }

    @Override
    public String toString() {
        return "MARCA: " + this.marca + "\nAno: " + this.ano;
    }
    
    
    
    
}








