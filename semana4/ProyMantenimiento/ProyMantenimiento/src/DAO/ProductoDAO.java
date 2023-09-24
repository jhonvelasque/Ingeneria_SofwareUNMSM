 package DAO;

import BEAN.Producto;
import UTIL.DbBean;
import java.sql.ResultSet;
import java.util.Vector;

public class ProductoDAO {
    public ProductoDAO(){
        listaProductos();
    }
    //Visualizaciòn (select)
    public Vector<Producto> listaProductos(){
        Vector<Producto> listaProd = new Vector<Producto>();
        DbBean con = new DbBean();
        String sql = "select * from producto ";
        
        try{
            ResultSet resultado;
            resultado = con.resultadoSQL(sql);
            while(resultado.next()){
                Producto prod = new Producto();
                prod.setId_producto(resultado.getInt(1));
                prod.setDescripcion(resultado.getString(2));
                prod.setTipo(resultado.getString(3));
                prod.setPrecio(resultado.getDouble(4));
                prod.setEstado(resultado.getInt(5));
                listaProd.addElement(prod);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.desconecta();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        return listaProd;
    }
    
    
    
    //Inserciòn (inserts)
    
    
    //Actualizaciòn (update)
    
    
    //Eliminaciòn (delete)
}
