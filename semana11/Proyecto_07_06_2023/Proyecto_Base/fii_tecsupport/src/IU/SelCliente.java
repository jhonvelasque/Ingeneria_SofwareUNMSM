package IU;

import BEAN.Cliente;
import DAO.clienteDAO;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class SelCliente extends javax.swing.JDialog {
    clienteDAO clieDao;
    DefaultTableModel dtm;
    Cliente clie;
    public SelCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        clieDao = new clienteDAO();
        clie = new Cliente();
        initComponents();
        dtm = (DefaultTableModel)this.tblClientes.getModel();
        llenaTblClientes(false, "");
    }
    
    private void llenaTblClientes(boolean sw, String cad){
        Vector<Cliente> listaClie;
        listaClie = this.clieDao.ListaItem(sw, cad);
        dtm.setRowCount(0);
        for(int i = 0;i<listaClie.size();i++){
            Vector vec = new Vector();
            vec.addElement(listaClie.get(i).getId_cliente());
            vec.addElement(listaClie.get(i).getApellidos());
            vec.addElement(listaClie.get(i).getNombres());
            vec.addElement(listaClie.get(i).getEstado());
            dtm.addRow(vec);
        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("SELECCIONA CLIENTE");

        jLabel2.setText("Buscar");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Cliente", "Apellidos", "Nombres", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        if(this.txtBuscar.getText().isEmpty()){
            llenaTblClientes(false, "");
        }else{
            llenaTblClientes(true, this.txtBuscar.getText());
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        int idx;
        idx = this.tblClientes.getSelectedRow();
        
        clie.setId_cliente(Integer.parseInt(dtm.getValueAt(idx, 0).toString()));
        clie.setApellidos(dtm.getValueAt(idx, 1).toString());
        clie.setNombres(dtm.getValueAt(idx, 2).toString());
        clie.setEstado(Integer.parseInt(dtm.getValueAt(idx, 3).toString()));
        
        this.dispose();
    }//GEN-LAST:event_tblClientesMouseClicked
    
    public Cliente devuelveCliente(){
        return clie;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
