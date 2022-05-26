package aula_heranca;

/**
 *
 * @author adaltoss
 */
public class Tela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.modelo = "Doblo";
        c1.setId();
        c1.acelerar();
        
        Carro c2 = new Carro("Toro", 2020, 4, true);
        c2.acelerar();
    }
    
}
