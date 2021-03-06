
package vistas;

import controlador.CoordTipoEvento;
import java.awt.BorderLayout;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Logica.LogicaTipoEvento;



public class PanelControl extends javax.swing.JFrame {
    
    IGReporte reporte;
    IGCrearInvitacion crearInvitacion;
    IGListaInvitado ListaInvitado;
    IGAgregarInvitado AgregarInvitado;
    IGCrearEvento crearEvento;
    IGListaUsuario listaUsuario;
    IGListaEvento listaEvento;
    
    //////coordinadores /////////////////
    private LogicaTipoEvento logicaTipoEvento;
    private CoordTipoEvento coordTipoEvento;
    
    public PanelControl() {
        initComponents();
        this.setLocationRelativeTo(null);
        iniciar();
       
    }
    
    private void iniciar(){
        irCreaUsuario();
        
        //// inicializar evento 
        logicaTipoEvento = new LogicaTipoEvento();
        coordTipoEvento = new CoordTipoEvento();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnEventoActual = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtNameUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbListaUsuario = new javax.swing.JLabel();
        lbCreaUsuario = new javax.swing.JLabel();
        lbCrearEvento = new javax.swing.JLabel();
        lbListaEvento = new javax.swing.JLabel();
        lbAgregarInvitado = new javax.swing.JLabel();
        lbListaInvitado = new javax.swing.JLabel();
        lbCrearInvitacion = new javax.swing.JLabel();
        lbReporte = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(226, 224, 224));

        jPanel1.setBackground(new java.awt.Color(97, 97, 97));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(158, 158, 158));

        btnEventoActual.setBackground(new java.awt.Color(120, 144, 156));
        btnEventoActual.setFont(new java.awt.Font("Open Sans", 1, 15)); // NOI18N
        btnEventoActual.setForeground(new java.awt.Color(255, 255, 255));
        btnEventoActual.setText("Evento actual");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        txtNameUser.setFont(new java.awt.Font("Open Sans", 1, 17)); // NOI18N
        txtNameUser.setText("Juan Matos Marte");

        jLabel1.setBackground(new java.awt.Color(66, 66, 66));
        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel1.setText("Cerrar sesión ");

        lbListaUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lbListaUsuario.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lbListaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbListaUsuario.setText("Lista de usuarios ");
        lbListaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbListaUsuarioMouseClicked(evt);
            }
        });

        lbCreaUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lbCreaUsuario.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lbCreaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbCreaUsuario.setText("Crear usuario");
        lbCreaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCreaUsuarioMouseClicked(evt);
            }
        });

        lbCrearEvento.setBackground(new java.awt.Color(255, 255, 255));
        lbCrearEvento.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lbCrearEvento.setForeground(new java.awt.Color(255, 255, 255));
        lbCrearEvento.setText("Crear eventos ");
        lbCrearEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCrearEventoMouseClicked(evt);
            }
        });

        lbListaEvento.setBackground(new java.awt.Color(255, 255, 255));
        lbListaEvento.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lbListaEvento.setForeground(new java.awt.Color(255, 255, 255));
        lbListaEvento.setText("Lista de eventos");
        lbListaEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbListaEventoMouseClicked(evt);
            }
        });

        lbAgregarInvitado.setBackground(new java.awt.Color(255, 255, 255));
        lbAgregarInvitado.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lbAgregarInvitado.setForeground(new java.awt.Color(255, 255, 255));
        lbAgregarInvitado.setText("Agregar invitados ");
        lbAgregarInvitado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAgregarInvitadoMouseClicked(evt);
            }
        });

        lbListaInvitado.setBackground(new java.awt.Color(255, 255, 255));
        lbListaInvitado.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lbListaInvitado.setForeground(new java.awt.Color(255, 255, 255));
        lbListaInvitado.setText("Lista de invitados ");
        lbListaInvitado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbListaInvitadoMouseClicked(evt);
            }
        });

        lbCrearInvitacion.setBackground(new java.awt.Color(255, 255, 255));
        lbCrearInvitacion.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lbCrearInvitacion.setForeground(new java.awt.Color(255, 255, 255));
        lbCrearInvitacion.setText("Crear Inviación ");
        lbCrearInvitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCrearInvitacionMouseClicked(evt);
            }
        });

        lbReporte.setBackground(new java.awt.Color(255, 255, 255));
        lbReporte.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lbReporte.setForeground(new java.awt.Color(255, 255, 255));
        lbReporte.setText("Reportes ");
        lbReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbReporteMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/user1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 55, Short.MAX_VALUE)
                .addComponent(btnEventoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCreaUsuario)
                            .addComponent(lbListaUsuario)
                            .addComponent(lbCrearEvento)
                            .addComponent(lbListaEvento)
                            .addComponent(lbAgregarInvitado)
                            .addComponent(lbListaInvitado)
                            .addComponent(lbCrearInvitacion)
                            .addComponent(lbReporte)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtNameUser))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNameUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbCreaUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbListaUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbCrearEvento)
                .addGap(13, 13, 13)
                .addComponent(lbListaEvento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbAgregarInvitado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbListaInvitado)
                .addGap(16, 16, 16)
                .addComponent(lbCrearInvitacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbReporte)
                .addGap(44, 44, 44)
                .addComponent(btnEventoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1003, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbCreaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCreaUsuarioMouseClicked
        irCreaUsuario();
        
    }//GEN-LAST:event_lbCreaUsuarioMouseClicked

    private void lbListaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaUsuarioMouseClicked
        irListaUsuario();
    }//GEN-LAST:event_lbListaUsuarioMouseClicked

    private void lbCrearEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCrearEventoMouseClicked
        try {
            irCreaEvento();
        } catch (ParseException ex) {
            Logger.getLogger(PanelControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbCrearEventoMouseClicked

    private void lbListaEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaEventoMouseClicked
        irListaEvento();
    }//GEN-LAST:event_lbListaEventoMouseClicked

    private void lbAgregarInvitadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAgregarInvitadoMouseClicked
        irAgregarInvitado();
    }//GEN-LAST:event_lbAgregarInvitadoMouseClicked

    private void lbListaInvitadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaInvitadoMouseClicked
       irListaInvitado(); 
    }//GEN-LAST:event_lbListaInvitadoMouseClicked

    private void lbCrearInvitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCrearInvitacionMouseClicked
     irCreaInvitacion();
    }//GEN-LAST:event_lbCrearInvitacionMouseClicked

    private void lbReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbReporteMouseClicked
        irReporte();
    }//GEN-LAST:event_lbReporteMouseClicked

    /**
     * Para ir al panel de crear usuario; 
     */
    private void irCreaUsuario(){
        IGCrearUsuario crearUsuario = new IGCrearUsuario();
        crearUsuario.setSize(1003, 712);
        pnlPrincipal.removeAll();
        pnlPrincipal.add(crearUsuario, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
    }
    private void irReporte(){
        reporte = new IGReporte();
        reporte.setSize(1003, 712);
        pnlPrincipal.removeAll();
        pnlPrincipal.add(reporte, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
    }
    private void irCreaInvitacion(){
        crearInvitacion = new  IGCrearInvitacion();
        crearInvitacion.setSize(1003, 712);
        pnlPrincipal.removeAll();
        pnlPrincipal.add(crearInvitacion, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
    }
    private void irListaInvitado(){
        ListaInvitado = new  IGListaInvitado ();
        ListaInvitado.setSize(1003, 712);
        pnlPrincipal.removeAll();
        pnlPrincipal.add(ListaInvitado, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
    }
    private void irAgregarInvitado(){
        AgregarInvitado = new IGAgregarInvitado();
        AgregarInvitado.setSize(1003, 712);
        pnlPrincipal.removeAll();
        pnlPrincipal.add(AgregarInvitado, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
    }
    private void irCreaEvento() throws ParseException{
        IGCrearEvento crearEvento = new IGCrearEvento();
       
        crearEvento.setCoordTipoEvento(coordTipoEvento);
        coordTipoEvento.setLogicaTipoEvento(logicaTipoEvento);
        
        crearEvento.setSize(1003, 712);
        pnlPrincipal.removeAll();
        pnlPrincipal.add(crearEvento, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
    }

    private void irListaUsuario(){
        listaUsuario= new IGListaUsuario ();
        listaUsuario.setSize(1003, 712);
        pnlPrincipal.removeAll();
        pnlPrincipal.add(listaUsuario, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
    }
    private void irListaEvento(){
        listaEvento = new IGListaEvento();
        listaEvento.setSize(1003, 712);
        pnlPrincipal.removeAll();
        pnlPrincipal.add(listaEvento, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelControl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEventoActual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAgregarInvitado;
    private javax.swing.JLabel lbCreaUsuario;
    private javax.swing.JLabel lbCrearEvento;
    private javax.swing.JLabel lbCrearInvitacion;
    private javax.swing.JLabel lbListaEvento;
    private javax.swing.JLabel lbListaInvitado;
    private javax.swing.JLabel lbListaUsuario;
    private javax.swing.JLabel lbReporte;
    public static javax.swing.JPanel pnlPrincipal;
    private javax.swing.JLabel txtNameUser;
    // End of variables declaration//GEN-END:variables
}
