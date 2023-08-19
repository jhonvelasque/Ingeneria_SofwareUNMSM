
package DAO;

import BEAN.Cliente;
import UTIL.DbBean;
import java.sql.ResultSet;
import java.util.Vector;

public class ClienteDAO {

    public ClienteDAO() {
    }
    //Visualizaciòn (select) 
    public Vector<Cliente> listaCliente(boolean sw, String cad){
        Vector<Cliente> listaClie = new Vector<Cliente>();
        DbBean con = new DbBean();
        String sql = "Select * from Cliente";
        
        if(sw == true){
            sql = sql + " where NombCliente like '"+ cad + "%'" ;
        }
        try{
            ResultSet resultado;
            resultado = con.resultadoSQL(sql);

            while(resultado.next()){
                Cliente clie = new Cliente();
                clie.setIdCliente(resultado.getInt(1));
                clie.setNombCliente(resultado.getString(2));
                clie.setApellCliente(resultado.getString(3));
                clie.setDocCliente(resultado.getString(4));
                clie.setSexo(resultado.getInt(5));
                clie.setNacionalidad(resultado.getString(6));
                clie.setFechNacimiento(resultado.getString(7));
                clie.setDireccion(resultado.getString(8));
                clie.setTelfCliente(resultado.getInt(9));
                clie.setCorreo(resultado.getString(10));
                listaClie.addElement(clie);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.desconecta();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        return listaClie;
    }
    
    //Inserción (inserts)
    public void insertaCliente(Cliente p){
       DbBean con=new DbBean();
       String sql;
        try{
            sql = "insert into cliente values ( ";
            sql = sql + " "+ p.getIdCliente() +", '"+ p.getNombCliente() +"', ";
            sql = sql + " '"+ p.getApellCliente() +"', '"+ p.getDocCliente() +"', ";
            sql = sql + " "+ p.getSexo() +", '"+ p.getNacionalidad() +"', ";
            sql = sql + " '"+ p.getFechNacimiento() +"', '"+ p.getDireccion() +"',";
            sql = sql + " "+ p.getTelfCliente() +", '"+ p.getCorreo() +"')";
            con.ejecutaSQL(sql);
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.desconecta();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
    }
       

    
    //Actualizaciòn (update)
    public void actualizaCliente(Cliente p){
        DbBean con = new DbBean();
        String sql;
        try{
            sql = "update cliente set NombCliente = '"+ p.getNombCliente() +"', ";
            sql += " ApellCliente = '"+ p.getApellCliente() +"', DocCliente = '"+ p.getDocCliente() +"', ";
            sql += " Nacionalidad = '"+ p.getNacionalidad() +"', FechaNacimiento = '"+ p.getFechNacimiento() +"', ";
            sql += " Direccion = '"+ p.getDireccion() +"', Correo = '"+ p.getCorreo() +"', ";
            sql += " TelfCliente = "+ p.getTelfCliente()+", Sexo= " +p.getSexo() +" ";
            sql += " where IdCliente = "+ p.getIdCliente() +" ";
           
            con.ejecutaSQL(sql);
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.desconecta();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
    }
}
       
       
    