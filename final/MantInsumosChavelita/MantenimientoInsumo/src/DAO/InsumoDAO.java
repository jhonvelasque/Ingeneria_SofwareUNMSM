 package DAO;

import BEAN.Insumo;
import UTIL.DbBean;
import java.sql.ResultSet;
import java.util.Vector;

public class InsumoDAO {
        public InsumoDAO(){
    }
    //Visualizaciòn (select)
    public Vector<Insumo> listaInsumo(boolean sw, String cad){
        Vector<Insumo> listaInsm = new Vector<Insumo>();
        DbBean con = new DbBean();
        String sql = " select * from Insumo "; 
        
        if(sw == true){
            sql = sql + " where DescInsumo like '"+ cad +"%'";
        }
        
        try{
            ResultSet resultado;
            resultado = con.resultadoSQL(sql);
            while(resultado.next()){
                Insumo prod = new Insumo();
                prod.setIdInsumo(resultado.getInt(1));
                prod.setDescInsumo(resultado.getString(2));
                prod.setTipo(resultado.getString(3));
                prod.setFechaVencimiento(resultado.getString(4));
                prod.setFechaLLegada(resultado.getString(5));
                prod.setStock(resultado.getInt(6));
                prod.setUnidad(resultado.getString(7));
                listaInsm.addElement(prod);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.desconecta();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        return listaInsm;
    }
    //Inserciòn (inserts)
    public void insertaInsumo(Insumo p){
        DbBean con = new DbBean();
        String sql;
        try{
            sql = "insert into Insumo values ( ";
            sql = sql + " "+ p.getIdInsumo()+", '"+ p.getDescInsumo()+"', ";
            sql = sql + " '"+ p.getTipo()+"', '"+ p.getFechaVencimiento()+"', ";
            sql = sql + " '"+ p.getFechaLLegada()+"', "+ p.getStock()+", ";
            sql = sql + " '"+ p.getUnidad()+"')";
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
      public void actualizaInsumo(Insumo p){
        DbBean con = new DbBean();
        String sql;
        try{
            sql = "update Insumo set DescInsumo = '"+ p.getDescInsumo()+"', ";
            sql += "Tipo= '"+ p.getTipo()+"', FechaVencimiento= '"+ p.getFechaVencimiento()+"', ";
            sql += "FechaLlegada= '"+ p.getFechaLLegada()+"', Stock= "+ p.getStock()+", ";
            sql += "Unidad= '"+p.getUnidad()+"'";
            sql +=" Where IdInsumo= "+p.getIdInsumo()+ "";
            
            
            
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

