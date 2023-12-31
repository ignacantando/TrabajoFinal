/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import controladores.ControladorVentanaLogin;
import modelo.ResumenContratacion;
import modelo.ResumenFactura;
/**
 *
 * @author ignac
 */
public class VentanaPrincipal extends javax.swing.JFrame implements IVista_Principal,KeyListener {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        grupo1.add(jRadioButtonComercio);
        grupo1.add(jRadioButtonVivienda);
        grupo2.add(jRadioButtonDorada);
        grupo2.add(jRadioButtonPlatino);
        jListHistorial.setModel(modeloHistorial);
        jListPagarFacturas.setModel(modeloFactura);
        jListDardeBaja.setModel(modeloDarDeBajaDefaultListModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPagarFacturas = new javax.swing.JList<>();
        jButtonPagar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonComercio = new javax.swing.JRadioButton();
        jRadioButtonVivienda = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButtonDorada = new javax.swing.JRadioButton();
        jRadioButtonPlatino = new javax.swing.JRadioButton();
        jSpinnerBotones = new javax.swing.JSpinner();
        jSpinnerCamaras = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBoxAcompaniamiento = new javax.swing.JCheckBox();
        jButtonContratar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCalle = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListDardeBaja = new javax.swing.JList<>();
        jButtonDarDeBaja = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListHistorial = new javax.swing.JList<>();
        jButtonCerrarSesion = new javax.swing.JButton();
        jButtonActualizarmes = new javax.swing.JButton();
        jButtonSolicitarVisita = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setBackground(new java.awt.Color(153, 0, 255));

        jPanel1.setBackground(new java.awt.Color(153, 102, 255));

        
        jScrollPane1.setViewportView(jListPagarFacturas);

        jButtonPagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonPagar.setText("Pagar");
        jButtonPagar.setActionCommand("PAGAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jButtonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButtonPagar)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Pagar Facturas", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 102, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo de servicio:");

        jRadioButtonComercio.setBackground(new java.awt.Color(153, 102, 255));
        jRadioButtonComercio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonComercio.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonComercio.setText("Comercio");
        jRadioButtonComercio.setActionCommand("COMERCIO");

        jRadioButtonVivienda.setBackground(new java.awt.Color(153, 102, 255));
        jRadioButtonVivienda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonVivienda.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonVivienda.setText("Vivienda");
        jRadioButtonVivienda.setActionCommand("VIVIENDA");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Elementos:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Promocion:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Elija las opciones");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jRadioButtonDorada.setBackground(new java.awt.Color(153, 102, 255));
        jRadioButtonDorada.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonDorada.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonDorada.setText("Dorada");
        jRadioButtonDorada.setActionCommand("DORADA");

        jRadioButtonPlatino.setBackground(new java.awt.Color(153, 102, 255));
        jRadioButtonPlatino.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonPlatino.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonPlatino.setText("Platino");
        jRadioButtonPlatino.setActionCommand("PLATINO");

        jSpinnerBotones.setPreferredSize(new java.awt.Dimension(60, 25));

        jSpinnerCamaras.setMaximumSize(new java.awt.Dimension(60, 25));
        jSpinnerCamaras.setMinimumSize(new java.awt.Dimension(60, 25));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("botones:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("camaras:");

        jCheckBoxAcompaniamiento.setBackground(new java.awt.Color(153, 102, 255));
        jCheckBoxAcompaniamiento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBoxAcompaniamiento.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxAcompaniamiento.setText("acompañamiento");
        jCheckBoxAcompaniamiento.setActionCommand("ACOM");

        jButtonContratar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonContratar.setText("Contratar");
        jButtonContratar.setActionCommand("CONTRATAR");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Domicilio:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("N° :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Calle:");

        jTextFieldCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButtonComercio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButtonVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jRadioButtonDorada, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 42, Short.MAX_VALUE)
                                        .addComponent(jRadioButtonPlatino, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextFieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(74, 74, 74))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSpinnerBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinnerCamaras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jCheckBoxAcompaniamiento)
                        .addContainerGap(47, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButtonContratar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonComercio)
                    .addComponent(jRadioButtonVivienda))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonDorada)
                    .addComponent(jRadioButtonPlatino))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerCamaras, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jCheckBoxAcompaniamiento))
                .addGap(27, 27, 27)
                .addComponent(jButtonContratar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jTabbedPane2.addTab("ContratarServicios", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 102, 255));

        
        jScrollPane2.setViewportView(jListDardeBaja);

        jButtonDarDeBaja.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonDarDeBaja.setText("Dar de baja");
        jButtonDarDeBaja.setActionCommand("DARDEBAJA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButtonDarDeBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDarDeBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Dar de baja servicios", jPanel3);

        
        jScrollPane3.setViewportView(jListHistorial);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Historial de facturas", jPanel4);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 540, 500));

        jButtonCerrarSesion.setBackground(new java.awt.Color(106, 106, 140));
        jButtonCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCerrarSesion.setActionCommand("CERRARSESION");
        jButtonCerrarSesion.setLabel("Cerrar sesion");
        getContentPane().add(jButtonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 160, 70));

        jButtonActualizarmes.setBackground(new java.awt.Color(87, 87, 171));
        jButtonActualizarmes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonActualizarmes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizarmes.setText("Actualizar mes");
        jButtonActualizarmes.setActionCommand("ACTUALIZAR");
        getContentPane().add(jButtonActualizarmes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 160, 70));

        jButtonSolicitarVisita.setBackground(new java.awt.Color(87, 87, 171));
        jButtonSolicitarVisita.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSolicitarVisita.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSolicitarVisita.setText("Solicitar visita\n tecnica"); // NOI18N
        jButtonSolicitarVisita.setActionCommand("SOLICITAR");
        jButtonSolicitarVisita.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonSolicitarVisita.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jButtonSolicitarVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 160, 70));

        jLabelFondo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\ignac\\OneDrive\\Documentos\\NetBeansProjects\\TrabajoFinal\\src\\resources\\imagen.jpg")); // NOI18N
        jLabelFondo.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabelFondo.setMinimumSize(new java.awt.Dimension(500, 500));
        jLabelFondo.setPreferredSize(new java.awt.Dimension(650, 500));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCalleActionPerformed

                                                    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizarmes;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonContratar;
    private javax.swing.JButton jButtonDarDeBaja;
    private javax.swing.JButton jButtonPagar;
    private javax.swing.JButton jButtonSolicitarVisita;
    private javax.swing.JCheckBox jCheckBoxAcompaniamiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JList<ResumenContratacion> jListDardeBaja;
    private javax.swing.JList<ResumenFactura> jListHistorial;
    private javax.swing.JList<ResumenFactura> jListPagarFacturas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButtonComercio;
    private javax.swing.JRadioButton jRadioButtonDorada;
    private javax.swing.JRadioButton jRadioButtonPlatino;
    private javax.swing.JRadioButton jRadioButtonVivienda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinnerBotones;
    private javax.swing.JSpinner jSpinnerCamaras;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextFieldCalle;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables
    
    private DefaultListModel<ResumenFactura> modeloFactura=new DefaultListModel<ResumenFactura>();
    private DefaultListModel<ResumenFactura> modeloHistorial=new DefaultListModel<ResumenFactura>();
    private DefaultListModel<ResumenContratacion>modeloDarDeBajaDefaultListModel=new DefaultListModel<ResumenContratacion>();
    private ButtonGroup grupo1=new ButtonGroup();
    private ButtonGroup grupo2=new ButtonGroup();
    private String botonMetodo;
    private ChangeListener verificador1=new ChangeListener() {
	
	@Override
		public void stateChanged(ChangeEvent e) {
			if((int)jSpinnerBotones.getValue()<0)
				jSpinnerBotones.setValue(0);
			
			if((int)jSpinnerCamaras.getValue()<0)
				jSpinnerCamaras.setValue(0);
			
		}
	};
    
	
	
    @Override
 	public void setActionListener(ActionListener controlador) {
 		this.jButtonActualizarmes.addActionListener(controlador);
 		this.jButtonCerrarSesion.addActionListener(controlador);
 		this.jButtonPagar.addActionListener(controlador);
 		this.jButtonContratar.addActionListener(controlador);
 		this.jButtonDarDeBaja.addActionListener(controlador);
 		this.jButtonSolicitarVisita.addActionListener(controlador);
 		
 		this.jRadioButtonComercio.addActionListener(controlador);
 		this.jRadioButtonDorada.addActionListener(controlador);
 		this.jRadioButtonPlatino.addActionListener(controlador);
 		this.jRadioButtonVivienda.addActionListener(controlador);
 		this.jCheckBoxAcompaniamiento.addActionListener(controlador);
 		
 		this.jSpinnerBotones.addChangeListener(verificador1);
 		this.jSpinnerCamaras.addChangeListener(verificador1);
 	}

 	@Override
 	public void setWindowListener(WindowListener controlador) {
 		this.addWindowListener(controlador);
 	}

 	@Override
 	public void ejecutar() {
 		setTitle("Ventana Principal");
        pack();
        setVisible(true);
        setLocationRelativeTo(null);	
        jRadioButtonComercio.setSelected(true);
        jRadioButtonDorada.setSelected(true);
        jButtonContratar.setEnabled(false);
        
 	}

 	@Override
 	public void cerrarVentana() {
 		setVisible(false); 
 	    dispose(); 
 	}



 	@Override
 	public void lanzarVentanaEmergente(String mensaje) {
 		JFrame jFrame = new JFrame();
         JOptionPane.showMessageDialog(jFrame, mensaje);		
 	}
 	
	public void setKeyListener() {
		this.jTextFieldNumero.addKeyListener(this);
	}

	
	
	//pestañas
	
	public ResumenFactura pagarFacturas() {
		int valor=jListPagarFacturas.getSelectedIndex();
		ResumenFactura factura=jListPagarFacturas.getSelectedValue();
		modeloFactura.remove(valor);
		
		return factura;
	}
	
	public void botonActualizar(ArrayList<ResumenFactura> resumen) {
		modeloFactura.clear();
		for(int i=0;i<resumen.size();i++)
			modeloFactura.add(i,resumen.get(i));
	}
	
	public void contratarServicios() {
		
	}
	
	public ResumenContratacion dardeBaja() { //lo llamaria desde el action performed si se presiona el boton
	
		int valor=jListDardeBaja.getSelectedIndex();
		ResumenContratacion contratacion=jListDardeBaja.getSelectedValue();
		modeloDarDeBajaDefaultListModel.remove(valor);
		
		return contratacion;
	}
	
	public void actualizarServicios(ArrayList<ResumenContratacion> resumen) {
	
		modeloDarDeBajaDefaultListModel.clear();
		for(int i=0;i<resumen.size();i++) {
			modeloDarDeBajaDefaultListModel.add(i,resumen.get(i));
		}
	}
	
	public void historialFacturas(ArrayList<ResumenFactura> resumen) {
		modeloHistorial.clear();
		for(int i=0;i<resumen.size();i++)
			modeloHistorial.add(i,resumen.get(i));
	}

	
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(jTextFieldNumero.getText().isEmpty() || (int)jSpinnerBotones.getValue()<0 || (int)jSpinnerCamaras.getValue()<0)
			jButtonContratar.setEnabled(false);
		else {
			jButtonContratar.setEnabled(true);
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	//getters
	public String getTipoPromo() {
		if(jRadioButtonDorada.isSelected())
			return "Dorada";
		else {
			return "Platino";
		}
	}
	
	public String getTipoContratacion() {
		if(jRadioButtonComercio.isSelected())
			return "Comercio";
		else {
			return "Vivienda";
		}
	}
	
	public String getNumero() {
		return jTextFieldNumero.getText();
	}
	
	public String getCalle() {
		return jTextFieldCalle.getText();
	}

	@Override
	public boolean getjCheckBoxAcompaniamiento() {
		// TODO Auto-generated method stub
		return jCheckBoxAcompaniamiento.isSelected();
	}

	@Override
	public int getCantBotones() {
		
		return (int)jSpinnerBotones.getValue();
	}

	@Override
	public int getCantCamaras() {
		// TODO Auto-generated method stub
		return (int)jSpinnerCamaras.getValue();
	}
	
	
	public String getMetodoPago() {
		Ventana_MetodoDePago ventana_MetodoDePago=new Ventana_MetodoDePago(this,true);
		ventana_MetodoDePago.setVisible(true);
		return botonMetodo;
	}

	public void setBoton(String metodo) {
		botonMetodo=metodo;
	}

	@Override
	public void limpiarContratar() {
		jTextFieldCalle.setText("");
		jTextFieldNumero.setText("");
		jSpinnerBotones.setValue(0);
		jSpinnerCamaras.setValue(0);
		jRadioButtonComercio.setSelected(true);
		jRadioButtonDorada.setSelected(true);
		jCheckBoxAcompaniamiento.setSelected(false);
		
	}
}