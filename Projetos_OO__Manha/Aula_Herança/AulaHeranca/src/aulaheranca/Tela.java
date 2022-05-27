package aulaheranca;

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
        c1.marca = "Fiat";
        c1.qtdPortas = 4;
        c1.setTamPortaMalas( 250.9 );
        c1.ano = 2015;
        c1.setId();
        c1.acelerar();
        c1.imprimir();
        
        Carro c2 = new Carro("Ferrari", 2022, 2);
        c2.setTamPortaMalas(150.0);
        c2.imprimir();
    }
    
}
