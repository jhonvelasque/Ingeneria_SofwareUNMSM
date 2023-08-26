# INTORDUCCION A FORMULARIOS
- Buenas practicas es  nombrar de manera intuitiva los tipos de contenedores,ejemplo :
  - [tipo de contendor][nombre descriptivo]
  - txtNombre (haces referencia a un txt que contiene la varibale nombre)
- Antes de hacer la logica tenemos que crear la clase que vamos hacer referencia
```java
    public class Producto{
        private int producto;
        private String descipcion;
        private String tipo;
        private double precio;
        //apartir de esto pudes crear los constructtores ,metodo set,y get de manera mas eficiente con el ID  que estes usando
        
    }

```
- NO TE OLVIDES CREAR LOS METODOS(FUNCIONES) QUE VAS A NECESITAR COMO EJEMPLO reportar Datos
```java
    
    public String reportaDatos(){
        String aux;
        aux = "Id Producto: "+this.idProducto;
        aux += "\nDescripción: "+this.descripcion;
        aux += "\nTipo: "+this.tipo;
        aux += "\nPrecio: "+this.precio;
        return aux;
    }
```
- Agregar Datos ?
  - el metodo Integer.parseInt() convierte los valores a int
  - el metodo Double.paseDouble() convirte los valores a double
- como se adsede al contenido de un txt?
    - se usa el metos .getText()
 - Como se adsede al como se adcesede al contenido de un cmd ?
    - se usa el metodo .getSelecdItem().toString()
 - Como usar agredar datos a  un vector en string?
    -   vector.addElemt(prod);


```java 
    private void btnAgregaActionPerformed(java.awt.event.ActionEvent evt) {                                          
            Producto prod;
            prod = new Producto();
            prod.setIdProducto(Integer.parseInt(this.txtIdProducto.getText()));//covertiendo a entero un txt
            prod.setDescripcion(this.txtDescripcion.getText());
            prod.setTipo(this.cmbTipo.getSelectedItem().toString());
            prod.setPrecio(Double.parseDouble(this.txtPrecio.getText()));
            // agrgando todos los datos de la clases al vector 
            vecProd.addElement(prod);
            limpia();
    }    
```
 - Como agrgar tipos a un cmb ?
    - Creando un metoso 
    ```java
        private void agregaTipos(){
        this.cmbTipo.addItem("");
        this.cmbTipo.addItem("Cómputo");
        this.cmbTipo.addItem("Ferretería");
        this.cmbTipo.addItem("Librería");
    }// Note oivides insatanciarlo en constructor 
    
    ```
 - Como guarmaos la informacion en un vector ?
    -  se declara como atributo del formulario
    -  se instancia dentro del constructor del formulario
    ```java
        Vector vecProd;
    ```
- Como se debe ver el cosntructor del formulario ?
```java 
    public FrnProducto() {
        vecProd = new Vector();
        initComponents();
        agregaTipos();
        
    }
```
- Como limpiar datos ?
 * se cre un metodo que vacia loas txt ,ejemplo:
 ```java
    private void limpia(){
        this.txtIdProducto.setText("");
        this.txtDescripcion.setText("");
        this.txtPrecio.setText("");
        this.cmbTipo.setSelectedItem("");
    }
 ```
- Como Reportar datos en java ?
    - se crea un metodo que muestre los valores de la clase con la quesestes trabajando
    ```java
    public String reportaDatos(){
        String aux;
        aux = "Id Producto: "+this.idProducto;
        aux += "\nDescripción: "+this.descripcion;
        aux += "\nTipo: "+this.tipo;
        aux += "\nPrecio: "+this.precio;
        return aux;
    }
    ```
    - Luego creas un bucle y una variable auxiliar para mostrar los datos
    ```java
    
    //profesor 
    private void btnReportaActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Producto prodAux;
        for(int i=0;i<vecProd.size();i++){
            //prodAux = (tipo de dato)Nombre del vector.get(i);
            prodAux = (Producto)vecProd.get(i);
            System.out.println(prodAux.reportaDatos());
            System.out.println("=================================");
        }
    ```
    - Como hacemos para salir del formulario?
        ```java
        this.dispose();
        ```

