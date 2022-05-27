package view;

import aulaheranca.Carro;
import aulaheranca.Moto;
import aulaheranca.Veiculo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class Tela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Carro c1 = new Carro();
//        c1.setMarca( "Fiat" );
//        c1.qtdPortas = 4;
//        c1.setTamPortaMalas( 250.9 );
//        c1.ano = 2015;
//        c1.setId();
// //       c1.acelerar();
// //       c1.imprimir();
//        
//        Carro c2 = new Carro("Ferrari", 2022, 2);
//        c2.setTamPortaMalas(150.0);
// //       c2.imprimir();
//        
//        
//     //   c1.cadastrar();
//     
//   //    System.out.println( c1.toString() );
   
        ArrayList<Veiculo> lista = new ArrayList<>();
 //       lista.add(c1);
 //       lista.add(c2);
 //       lista.get( 1 ).acelerar();
 
        String marca;
        int ano, cilindradas, qtdPortas, tamPortaMalas;
        boolean partidaEletrica;
        
        String opcao = "s";
        do{
            
            int carroOuMoto = Integer.valueOf( JOptionPane.showInputDialog("Carro - 1 \n Moto - 2 \n Digite o número escolhido:")  );
            
            marca = JOptionPane.showInputDialog("Digite a marca:");
            ano  = Integer.valueOf( JOptionPane.showInputDialog("Digite o ano:") );
            
            if( carroOuMoto == 1 ){
                qtdPortas = Integer.valueOf( JOptionPane.showInputDialog("Digite a quantidade de portas:") );
                
                Carro carro = new Carro();
                carro.setMarca( marca );
                carro.ano = ano;
                carro.qtdPortas = qtdPortas;
                lista.add(carro);
            }else{
                Moto moto = new Moto();
                moto.setMarca(marca);
                moto.ano = ano;
                moto.cilindradas = Integer.valueOf( JOptionPane.showInputDialog("Digite a qtd de cilindradas:") );
                lista.add(moto);
                
            }
            imprimirLista(lista);
            
            opcao = JOptionPane.showInputDialog("Deseja cadastrar mais veículos? \n S - Sim \n N - Não ");
        }while( ! opcao.equalsIgnoreCase("n")  );
        
     
    }
    
    
    public static void imprimirLista( ArrayList<Veiculo> lista){
        String texto = "";
        for (Veiculo veiculo : lista) {
            texto += veiculo.toString() + "\n----------------\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }
    
    
    
}
