package PRUEBA;

import BEAN.Producto;

public class Test {
    public static void main(String args[]){
        int a;
        Producto prod1;
        prod1 = new Producto(101);
        System.out.println(prod1.reportaDatos());
        System.out.println("================");
        prod1.setDescripcion("Impresora matricial");
        prod1.setTipo("Cómputo");
        prod1.setPrecio(1500.5);
        System.out.println(prod1.reportaDatos());
        
        
        System.out.println("================");
        Producto prod2;
        prod2 = new Producto(102, "Laptop HP", "Cómputo", 2500.5);
        System.out.println(prod2.reportaDatos());
        System.out.println("El precio de producto 102 es: "+prod2.getPrecio());
        
        
        
        
        
        
    }
}
