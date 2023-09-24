package DAO;

import BEAN.personal;
import UTIL.DbBean;
import java.sql.*;
import java.util.Vector;

public class personalDAO {

    public Vector<personal> ListaItem(boolean sw, String str){
        Vector<personal> item = new Vector<personal>();
        DbBean con = new DbBean();
        String sql = "Select * from personal";
        if(sw == true){
            sql = sql + " WHERE (apellidos LIKE '"+ str +"%') OR (nombres LIKE '" + str + "%')";
        }
        System.out.println(sql);
        try{
            ResultSet resultado = con.resultadoSQL(sql);

            while(resultado.next()){
                personal perso = new personal();
                perso.setId_personal(resultado.getInt(1));
                perso.setApellidos(resultado.getString(2));
                perso.setNombres(resultado.getString(3));
                perso.setEstado(resultado.getInt(4));
                item.addElement(perso);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.desconecta();
        }catch(SQLException e){}

        return item;
    }
    public int procesaItem(personal p, String proc){
       int resultado=0;
       String sql= "";
       DbBean con=new DbBean();
       if(proc.equals("insert")){
            sql="INSERT INTO personal VALUES ('"+ p.getId_personal() +"', '"+ p.getApellidos() +"', '"+ p.getNombres() +"', '"+ p.getEstado() +"')";
            System.out.println("uuuuuuu" + sql);
       }
       if(proc.equals("update")){
            sql="UPDATE personal set apellidos = '"+ p.getApellidos() +"', nombres = '"+ p.getNombres() +"', estado = '"+ p.getEstado() +"' where id_personal = '"+ p.getId_personal() +"'";
       }
       System.out.println("Observando el estado de la sentencia sql: "+sql);

       try{
          resultado=con.ejecutaSQL(sql);
        }
        catch(java.sql.SQLException e){e.printStackTrace();
        }
        try{
        con.desconecta();
        }
        catch(SQLException e){
        }
          return resultado;
      }
}
