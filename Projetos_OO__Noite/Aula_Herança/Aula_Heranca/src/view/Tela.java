package view;

import aula_heranca.Carro;
import aula_heranca.Moto;
import aula_heranca.Veiculo;
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
//        c1.setModelo( "Doblo" );
//        c1.setId();
//        c1.acelerar();
//        c1.ano = 2022;
        
//        Carro c2 = new Carro("Toro", 2020, 4, true);
//        c2.acelerar();
//        
// //       System.out.println( c1.toString() );
// 
//        c2.cadastrar();
//        

        ArrayList<Veiculo> lista = new ArrayList<>();
        String opcao, modelo;
        int ano;
        do{
            int carroOuMoto = Integer.valueOf( JOptionPane.showInputDialog( " 1 - Carro \n 2 -  Moto \n Deseja cadastrar qual veículo?") );
            
            modelo = JOptionPane.showInputDialog( "Digite o modelo: ");
            ano = Integer.parseInt(  JOptionPane.showInputDialog( "Digite o ano: ")  );
            
            if( carroOuMoto == 1 ){
                Carro carro = new Carro();
                carro.setModelo( modelo );
                carro.ano = ano;
                carro.qtdPortas = Integer.parseInt(  JOptionPane.showInputDialog( "Digite a quantidade de portas: ")  );
                lista.add( carro );
            }else{
                Moto moto = new Moto(modelo, ano);
                moto.cilindradas = Integer.parseInt(  JOptionPane.showInputDialog( "Digite a quantidade de cilindradas: ") );
                lista.add( moto );
            }
            
            imprimirLista(lista);
            
            opcao = JOptionPane.showInputDialog( " S - Sim \n N - Não \nDeseja cadastrar mais um veículo?");
        }while ( ! opcao.equalsIgnoreCase( "n") );

    }
    
    public static void imprimirLista(ArrayList<Veiculo> lista){
        String texto = "";
        for (Veiculo veiculo : lista) {
            texto += veiculo.toString() ;
            texto += "\n-------------------\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }
    
}
