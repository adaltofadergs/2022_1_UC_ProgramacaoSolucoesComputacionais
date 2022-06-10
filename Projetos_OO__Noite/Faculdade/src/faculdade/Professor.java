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
        String sql =  "INSERT INTO professor (nome, email, salario) VALUES ( "
                    + " '" + this.getNome() +   "' ,  "
                    + " '" + this.getEmail() +  "' ,  "
                    + "  " + this.getSalario() +"  ) ";
        Conexao.executar( sql );
    }
    
    public void editar(){
        String sql =  "UPDATE professor SET  "
                    + " nome    = '" + this.getNome() +   "' ,  "
                    + " email   = '" + this.getEmail() +  "' ,  "
                    + " salario =  " + this.getSalario() +"     "
                    + " WHERE idProfessor = " + this.getId();
        Conexao.executar( sql );
    }
    
    public static void excluir(int idProfessor){
        String sql =  "DELETE FROM professor WHERE idProfessor = " + idProfessor;
        Conexao.executar( sql );
    }
    
    
    public static ArrayList<Professor> getProfessores(){
        ArrayList<Professor> lista = new ArrayList<>();
        
        String sql = "SELECT idProfessor, nome, email, salario FROM professor ORDER BY nome ";
        
        ResultSet rs = Conexao.consultar( sql );
        
        if( rs != null){
            
            try{
                while ( rs.next() ) {                
                    String nome = rs.getString( 2 );
                    String email = rs.getString( "email" );
                    double salario = rs.getDouble( 4 );
                    Professor prof = new Professor(nome, email, salario);
                    prof.setId( rs.getInt( "idProfessor" ) );
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
