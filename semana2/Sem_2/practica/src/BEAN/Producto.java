/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;

/**
 *
 * @author carlo
 */
public class Producto {
    private int idProducto;
    private String descripcion;
    private String tipo;
    private Double precio;

    public Producto(int idProducto, String descripcion, String tipo, Double precio) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;
    }
    public Producto(){
    }

    public Producto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public String reportaDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
