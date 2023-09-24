package IU;

import BEAN.Cliente;
import BEAN.Producto;
import BEAN.cab_venta;
import BEAN.det_venta;
import DAO.cab_ventaDAO;
import DAO.clienteDAO;
import DAO.det_ventaDAO;
import UTIL.Util;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmVenta extends javax.swing.JInternalFrame {
    DefaultTableModel dtm1;
    DefaultTableModel dtm2;
    DefaultTableModel dtm3;
    
    cab_ventaDAO cabVentaDao;
    det_ventaDAO detVentaDao;
    public FrmVenta() {
        initComponents();
        this.jTabbedPane1.setSelectedIndex(1);
        cabVentaDao = new cab_ventaDAO();
        detVentaDao = new det_ventaDAO();
        
        dtm1 = (DefaultTableModel)this.tblProducto.getModel();
        dtm2 = (DefaultTableModel)this.tblCliente.getModel();
        dtm3 = (DefaultTableModel)this.tblCompraCliente.getModel();
        
        llenaTblCliente(false, "");
    }
    
    private void llenaTblCliente(boolean sw, String cad){
        clienteDAO clieDao = new clienteDAO();
        
        Vector<Cliente> listaClie;
        listaClie = clieDao.ListaItem(sw, cad);
        
        dtm2.setRowCount(0);
        
        for(int i=0;i<listaClie.size();i++){
            Vector vec = new Vector();
            vec.addElement(listaClie.get(i).getId_cliente());
            vec.addElement(listaClie.get(i).getApellidos());
            vec.addElement(listaClie.get(i).getNombres());
            dtm2.addRow(vec);
        }
    }
    
    private void llenaTblCompraCliente(String idClie){
        Vector<cab_venta> listaVenta;
        listaVenta = this.cabVentaDao.ListaItem(true, idClie);
        
        dtm3.setRowCount(0);
        if(listaVenta.size() > 0){
            for(int i=0;i<listaVenta.size();i++){
                Vector vec = new Vector();
                vec.addElement(listaVenta.get(i).getId_venta());
                vec.addElement(listaVenta.get(i).getId_cliente());
                vec.addElement(listaVenta.get(i).getFecha());
                vec.addElement(listaVenta.get(i).getEstado());
                dtm3.addRow(vec);
            }
        }else{
            JOptionPane.showMessageDialog(this, "El cliente seleccionado no ha comprado");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtBuscaCliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCompraCliente = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        btnBuscaCliente = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnBuscaProducto = new javax.swing.JButton();
        btnAgrega = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        btnGrabar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registro de Venta");

        jLabel10.setText("Buscar Cliente");

        txtBuscaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaClienteKeyReleased(evt);
            }
        });

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Cliente", "Apellidos", "Nombres"
            }
        ));
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCliente);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Compras Cliente"));

        tblCompraCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Venta", "Id Cliente", "Fecha", "Estado"
            }
        ));
        jScrollPane3.setViewportView(tblCompraCliente);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Búsqueda Ventas", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Cliente"));

        jLabel2.setText("Id Cliente");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Nombres");

        txtIdCliente.setEnabled(false);

        txtApellidos.setEnabled(false);

        txtNombres.setEnabled(false);

        btnBuscaCliente.setText("Buscar Cliente");
        btnBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(21, 21, 21)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(btnBuscaCliente)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombres)
                            .addComponent(txtApellidos))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Producto"));

        jLabel5.setText("Id Producto");

        jLabel6.setText("Descripción");

        jLabel7.setText("Tipo");

        jLabel8.setText("Precio");

        txtIdProducto.setEnabled(false);

        txtDescripcion.setEnabled(false);

        txtTipo.setEnabled(false);

        txtPrecio.setEnabled(false);

        btnBuscaProducto.setText("Buscar Producto");
        btnBuscaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaProductoActionPerformed(evt);
            }
        });

        btnAgrega.setText("Agregar");
        btnAgrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregaActionPerformed(evt);
            }
        });

        jLabel9.setText("Cantidad");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescripcion))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(45, 45, 45)
                                .addComponent(txtTipo))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(35, 35, 35)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtCantidad)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgrega, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscaProducto)
                        .addGap(43, 43, 43))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaProducto))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgrega)
                    .addComponent(jLabel9)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton4.setText("Grabar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Limpiar");

        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Producto", "Descripción", "Tipo", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProducto);

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jButton4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnGrabar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(153, 153, 153))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrabar)
                    .addComponent(btnLimpiar))
                .addGap(220, 220, 220)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ventas", jPanel2);

        btnSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(668, 668, 668)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(328, 328, 328))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaClienteActionPerformed
           Cliente clie;
           SelCliente dialog = new SelCliente(new javax.swing.JFrame(), true);
           dialog.setVisible(true);
           clie = dialog.devuelveCliente();
           
           this.txtIdCliente.setText(String.valueOf(clie.getId_cliente()));
           this.txtApellidos.setText(clie.getApellidos());
           this.txtNombres.setText(clie.getNombres());
    }//GEN-LAST:event_btnBuscaClienteActionPerformed

    private void btnBuscaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaProductoActionPerformed
        Producto p;
        SelProducto dialog = new SelProducto(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        p = dialog.devProd();
        this.txtIdProducto.setText(String.valueOf(p.getId_producto()));
        this.txtDescripcion.setText(p.getDescripcion());
        this.txtTipo.setText(p.getTipo());
        this.txtPrecio.setText(String.valueOf(p.getPrecio()));
    }//GEN-LAST:event_btnBuscaProductoActionPerformed

    private void btnAgregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregaActionPerformed
        if(this.txtIdProducto.getText().isEmpty() || this.txtCantidad.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto y cantidad");
        }else{
            Vector vec = new Vector();
            vec.addElement(this.txtIdProducto.getText());
            vec.addElement(this.txtDescripcion.getText());
            vec.addElement(this.txtTipo.getText());
            vec.addElement(this.txtPrecio.getText());
            vec.addElement(this.txtCantidad.getText());
            dtm1.addRow(vec);
            limpiaProducto();
        }
    }//GEN-LAST:event_btnAgregaActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        if(dtm1.getRowCount() == 0 || this.txtIdCliente.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe seleccionar cliente y por lo menos 1 producto");
        }else{
            Util u = new Util();
            int idVenta;
            String fech;

            //Insertando en cab_venta
            cab_venta cv = new cab_venta();
            idVenta = u.idNext("cab_venta", "Id_Venta");
            fech = u.obtenerFecha();

            cv.setId_venta(idVenta);
            cv.setId_cliente(Integer.parseInt(this.txtIdCliente.getText()));
            cv.setFecha(fech);
            cv.setEstado(1);

            this.cabVentaDao.procesaItem(cv, "insert");
            //Insertando en det_venta
            for(int i=0;i<dtm1.getRowCount();i++){
                det_venta dv = new det_venta();
                dv.setId_venta(idVenta);
                dv.setId_producto(Integer.parseInt(dtm1.getValueAt(i, 0).toString()));
                dv.setPrecio(Double.parseDouble(dtm1.getValueAt(i, 3).toString()));
                dv.setCantindad(Integer.parseInt(dtm1.getValueAt(i, 4).toString()));
                this.detVentaDao.procesaItem(dv, "insert");
            }
            limpiaProducto();
            limpiaCliente();
            dtm1.setRowCount(0);
            JOptionPane.showMessageDialog(this, "Transacción concretada satisfactoriamente");
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void txtBuscaClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaClienteKeyReleased
        if(this.txtIdCliente.getText().isEmpty()){
            this.llenaTblCliente(false, "");
        }else{
            this.llenaTblCliente(true, this.txtIdCliente.getText());
        }
    }//GEN-LAST:event_txtBuscaClienteKeyReleased

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        int idx;
        idx = this.tblCliente.getSelectedRow();
        String idClie;
        idClie = dtm2.getValueAt(idx, 0).toString();
        this.llenaTblCompraCliente(idClie);
    }//GEN-LAST:event_tblClienteMouseClicked
    
    private void limpiaProducto(){
        this.txtIdProducto.setText("");
        this.txtDescripcion.setText("");
        this.txtTipo.setText("");
        this.txtPrecio.setText("");
        this.txtCantidad.setText("");
    }
    private void limpiaCliente(){
        this.txtIdCliente.setText("");
        this.txtApellidos.setText("");
        this.txtNombres.setText("");
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgrega;
    private javax.swing.JButton btnBuscaCliente;
    private javax.swing.JButton btnBuscaProducto;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTable tblCompraCliente;
    private javax.swing.JTable tblProducto;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscaCliente;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
