/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author adaltoss
 */
public class Conta {
    
    public static final double TARIFA = 1.00;
    
    private double saldo;
    protected String numero;
    public String tipo;
    
    
    // Método Acessor do atributo Saldo
    public double getSaldo(){
        return this.saldo;
    }
    
    // Método Modificador do atributo Saldo
    public void setSaldo(double saldo){
        boolean gerente = false;
        
        if( gerente ){
            this.saldo = saldo;
        }else{
            System.out.println("Somente gerentes podem alterar o valor");
        }
    }
    
    
    public void depositar(double valor){
        if( this.saldo + valor >= TARIFA){
            this.saldo += valor;
            this.descontarTarifa();
        }else{
            System.out.println("Valor mínimo não permitido!");
        }
    }
    
    private void descontarTarifa(){
        this.saldo -= TARIFA;
    }
    
    public void sacar(double valor){
        if( this.saldo - valor - TARIFA >= 0){
            this.saldo -= valor;
            this.descontarTarifa();
        }else{
            System.out.println("Saldo Insuficiente!");
        }
    }
    
}
