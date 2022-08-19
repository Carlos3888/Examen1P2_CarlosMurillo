/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_carlosmurillo;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Jafeth
 */
public class Apex extends javax.swing.JFrame {

    /**
     * Creates new form Apex
     */
    DefaultComboBoxModel modelo;
    DefaultComboBoxModel modelopersonaje;
    ArrayList lista_armas = new ArrayList();
    ArrayList lista_personajes = new ArrayList();
    ArrayList lista_tipos = new ArrayList();
    public Apex() {
        initComponents();
        
        
        modelo
                = (DefaultComboBoxModel) l_armas.getModel();
        modelo.addElement( new Arma("FlatLine", 10, 80));
        modelo.addElement( new Arma("Carabina", 15, 90));
        modelo.addElement( new Arma("PeaceFinder", 30, 40));

        l_armas.setModel(modelo);
        
        lista_armas.add(new Arma("FlatLine", 10, 80));
        lista_armas.add(new Arma("Carabina", 15, 90));
        lista_armas.add(new Arma("PeaceFinder", 30, 40));
        
        modelopersonaje
                = (DefaultComboBoxModel) Personajes.getModel();
        modelopersonaje.addElement( new Medico("LifeLine", 100, 50, new Arma("FlatLine", 10, 80)));
        modelopersonaje.addElement( new Rastreador("Vantage", 100, 50, new Arma("PeaceFinder", 30, 40)));
        modelopersonaje.addElement( new Fortaleza("Gibby", 125, 75, new Arma("Carabina", 15, 90)));

        Personajes.setModel(modelopersonaje);
        
        lista_personajes.add(new Medico("LifeLine", 100, 50, new Arma("FlatLine", 10, 80)));
        lista_personajes.add(new Rastreador("Vantage", 100, 50, new Arma("PeaceFinder", 30, 40)));
        lista_personajes.add(new Fortaleza("Gibby", 125, 75, new Arma("Carabina", 15, 90)));
        lista_tipos.add("Medico");
        lista_tipos.add("Rastreador");
        lista_tipos.add("Fortaleza");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P_crear = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Personajes = new javax.swing.JComboBox<>();
        b_seleccionar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        comenzar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        partida = new javax.swing.JTextArea();
        restantes = new javax.swing.JLabel();
        t_atacar = new javax.swing.JTextField();
        atacar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        j_nombre = new javax.swing.JTextField();
        j_vida = new javax.swing.JTextField();
        j_escudo = new javax.swing.JTextField();
        j_tipo = new javax.swing.JComboBox<>();
        l_armas = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        a_nombre = new javax.swing.JTextField();
        a_presicion = new javax.swing.JTextField();
        a_dano = new javax.swing.JTextField();
        c_personaje = new javax.swing.JButton();
        c_arma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccionar Personaje");

        b_seleccionar.setText("Seleccionar");
        b_seleccionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_seleccionarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(Personajes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_seleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Personajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_seleccionar)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        P_crear.addTab("Seleccionar", jPanel1);

        comenzar.setText("Comenzar");
        comenzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comenzarMouseClicked(evt);
            }
        });

        partida.setColumns(20);
        partida.setRows(5);
        jScrollPane1.setViewportView(partida);

        restantes.setText("Restantes: ");

        atacar.setText("Atacar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(comenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(restantes, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(t_atacar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(atacar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(141, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comenzar)
                    .addComponent(restantes))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_atacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atacar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        P_crear.addTab("Jugar", jPanel2);

        jLabel2.setText("Nombre");

        jLabel3.setText("Vida");

        jLabel4.setText("Tipo");

        jLabel5.setText("Escudo");

        jLabel6.setText("Arma");

        j_escudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_escudoActionPerformed(evt);
            }
        });

        j_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fortaleza", "Medico", "Rastreador" }));

        jLabel7.setText("Crear Arma");

        jLabel8.setText("Nombre");

        jLabel9.setText("Presición");

        jLabel10.setText("Daño");

        a_presicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_presicionActionPerformed(evt);
            }
        });

        c_personaje.setText("Crear Personaje");
        c_personaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c_personajeMouseClicked(evt);
            }
        });
        c_personaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_personajeActionPerformed(evt);
            }
        });

        c_arma.setText("Crear Arma");
        c_arma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c_armaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(j_escudo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                .addComponent(j_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(l_armas, javax.swing.GroupLayout.Alignment.LEADING, 0, 111, Short.MAX_VALUE)
                                    .addComponent(j_vida, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(j_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(c_personaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(a_dano, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a_nombre, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel9))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(a_presicion)
                                    .addComponent(c_arma, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j_vida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_escudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_armas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_personaje))
                .addGap(44, 44, 44)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a_presicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a_dano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_arma))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        P_crear.addTab("Crear", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(P_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(P_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j_escudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_escudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_escudoActionPerformed

    private void a_presicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_presicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_presicionActionPerformed

    private void c_armaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c_armaMouseClicked
        String nombre = a_nombre.getText();
        int presicion = Integer.parseInt(a_presicion.getText());
        int dano = Integer.parseInt(a_dano.getText());
        modelo.addElement( new Arma(nombre, presicion, dano));
         a_nombre.setText("");
         a_presicion.setText("");
         a_dano.setText("");
         lista_armas.add(new Arma(nombre, presicion, dano));
    }//GEN-LAST:event_c_armaMouseClicked

    private void b_seleccionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_seleccionarMouseClicked
        
    }//GEN-LAST:event_b_seleccionarMouseClicked

    private void c_personajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c_personajeMouseClicked
        String tipo = j_tipo.getSelectedItem().toString();
        String nombre = j_nombre.getText();
        int vida = Integer.parseInt(j_vida.getText());
        int escudo = Integer.parseInt(j_escudo.getText()); 
        int num = l_armas.getSelectedIndex();
        Arma arma = (Arma) lista_armas.get(num);
        if(tipo.equals("Fortaleza")){
            modelopersonaje.addElement( new Fortaleza(nombre, vida, escudo, arma));
            lista_personajes.add(new Fortaleza(nombre, vida, escudo, arma));
            lista_tipos.add("Fortaleza");
        }else if(tipo.equals("Medico")){
            modelopersonaje.addElement( new Medico(nombre, vida, escudo, arma));
            lista_personajes.add(new Medico(nombre, vida, escudo, arma));
            lista_tipos.add("Medico");
        }else{
            modelopersonaje.addElement( new Rastreador(nombre, vida, escudo, arma));
            lista_personajes.add(new Rastreador(nombre, vida, escudo, arma));
            lista_tipos.add("Rastreador");
        }
        j_nombre.setText("");
        j_vida.setText("");
        j_escudo.setText("");
        
    }//GEN-LAST:event_c_personajeMouseClicked

    private void c_personajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_personajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_personajeActionPerformed

    private void comenzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comenzarMouseClicked
        ArrayList lista_usuarios = new ArrayList();
        String nombre = "";
        String contra = "";
        for (int i = 0; i < 60; i++) {
            if(i != 59){
                Random numero = new Random();
                int id = numero.nextInt(1000);
                for (int j = 0; j < 10; j++) {
                    String abec ="abcdefghijklmnopqrstuvwxyz";
                    int num1 = abec.length();
                    int num2 = numero.nextInt(num1);
                    int num3 = numero.nextInt(num1);
                    char letra1 = abec.charAt(num2);
                    char letra2 = abec.charAt(num3);
                    nombre += letra1;
                    contra += letra2;
                }
                int num4 = lista_personajes.size();
                int num5 = numero.nextInt(num4);
                if(lista_tipos.get(num5).equals("Fortaleza")){
                    Fortaleza personaje = (Fortaleza) lista_personajes.get(num5);
                    lista_usuarios.add(new Usuario(nombre, id, contra, personaje));
                }else if(lista_tipos.get(num5).equals("Medico")){
                    Medico personaje = (Medico) lista_personajes.get(num5);
                    lista_usuarios.add(new Usuario(nombre, id, contra, personaje));
                }else{
                    Rastreador personaje = (Rastreador) lista_personajes.get(num5);
                    lista_usuarios.add(new Usuario(nombre, id, contra, personaje));
                }
                
                
                
            }else{
                
            }
        }
    }//GEN-LAST:event_comenzarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Apex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane P_crear;
    private javax.swing.JComboBox<String> Personajes;
    private javax.swing.JTextField a_dano;
    private javax.swing.JTextField a_nombre;
    private javax.swing.JTextField a_presicion;
    private javax.swing.JButton atacar;
    private javax.swing.JButton b_seleccionar;
    private javax.swing.JButton c_arma;
    private javax.swing.JButton c_personaje;
    private javax.swing.JButton comenzar;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField j_escudo;
    private javax.swing.JTextField j_nombre;
    private javax.swing.JComboBox<String> j_tipo;
    private javax.swing.JTextField j_vida;
    private javax.swing.JComboBox<String> l_armas;
    private javax.swing.JTextArea partida;
    private javax.swing.JLabel restantes;
    private javax.swing.JTextField t_atacar;
    // End of variables declaration//GEN-END:variables
}
