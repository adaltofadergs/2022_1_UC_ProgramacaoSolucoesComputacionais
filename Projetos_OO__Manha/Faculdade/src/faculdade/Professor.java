package faculdade;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Professor extends Pessoa{
    
    private double salario;    
    
    public Professor(String nome, String email, double salario){
        super(nome, email);
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void cadastrar(){
        String sql = " INSERT INTO professor (nome, email, salario) VALUES ( "
                + " '" + this.getNome()  +   "' , "
                + " '" + this.getEmail() +   "' , " 
                + "  " + this.getSalario() + " );  " ;
        Conexao.executar( sql );
    }
    
    
    public static ArrayList<Professor> getProfessores(){
        ArrayList<Professor> lista = new ArrayList<>();
        
        String sql = " SELECT idProfessor, nome, email, salario FROM professor ";
        ResultSet rs = Conexao.consultar( sql );
        
        if( rs != null ){
            try{
                while ( rs.next() ) { 
                    String nome = rs.getString( "nome" );
                    String email = rs.getString( 3 );
                    double salario = rs.getDouble( "salario");
                    Professor prof = new Professor( nome, email  , salario );
                    lista.add( prof );
                    
                }
            }catch(Exception e){
                
            }
        }
        
        return lista;
    }
    
    
   @Override
    public void dados(){
        super.dados();
        System.out.println("Salario: " + getSalario());
        System.out.println("#########################");
    }
}
