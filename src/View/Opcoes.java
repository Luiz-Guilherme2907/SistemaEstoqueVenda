/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URI;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author caiop
 */
public class Opcoes extends javax.swing.JFrame {

    private static boolean aberto = false;
    
    TelaPrincipal TP = new TelaPrincipal();
    
    
    public Opcoes() {
    
        initComponents();
        
        if(TP.getTema() == true){
            label_fundo_opcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_opcoes_2.png"))); 
        }else 
            if(TP.getTema() == false){
           label_fundo_opcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_preto_opcoes_2.png")));  
            } 
        
        //Caso feche pelas Abas não da erro!
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                aberto = false;
                dispose();
            }
        });

        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialog = new javax.swing.JDialog();
        JP_Fundo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        b_sair = new javax.swing.JButton();
        label_titulo_opcoes = new javax.swing.JLabel();
        b_voltar = new javax.swing.JButton();
        b_sobre = new javax.swing.JButton();
        label_fundo_opcoes = new javax.swing.JLabel();

        javax.swing.GroupLayout dialogLayout = new javax.swing.GroupLayout(dialog.getContentPane());
        dialog.getContentPane().setLayout(dialogLayout);
        dialogLayout.setHorizontalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dialogLayout.setVerticalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        JP_Fundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        JP_Fundo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 625));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        JP_Fundo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 5));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        JP_Fundo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 0, 5, 630));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        JP_Fundo.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 625, 730, 5));

        jPanel5.setOpaque(false);

        b_sair.setBackground(new java.awt.Color(8, 119, 197));
        b_sair.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        b_sair.setForeground(new java.awt.Color(255, 255, 255));
        b_sair.setText("Sair");
        b_sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_sairActionPerformed(evt);
            }
        });

        label_titulo_opcoes.setFont(new java.awt.Font("Counter-Strike", 2, 48)); // NOI18N
        label_titulo_opcoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo_opcoes.setText("Opções");

        b_voltar.setBackground(new java.awt.Color(8, 119, 197));
        b_voltar.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        b_voltar.setForeground(new java.awt.Color(255, 255, 255));
        b_voltar.setText("Voltar");
        b_voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_voltarActionPerformed(evt);
            }
        });

        b_sobre.setBackground(new java.awt.Color(8, 119, 197));
        b_sobre.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        b_sobre.setForeground(new java.awt.Color(255, 255, 255));
        b_sobre.setText("Sobre");
        b_sobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_sobre.setFocusPainted(false);
        b_sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_sobreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_sobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_titulo_opcoes, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addGap(239, 239, 239))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(b_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(b_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(label_titulo_opcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(b_sobre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 344, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_sair)
                    .addComponent(b_voltar))
                .addGap(67, 67, 67))
        );

        JP_Fundo.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 610));

        label_fundo_opcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_opcoes_2.png"))); // NOI18N
        JP_Fundo.add(label_fundo_opcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    
    public boolean estaAberto(){
        return aberto;
    }
    
    
    private void b_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_b_sairActionPerformed

    private void b_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_voltarActionPerformed
        this.aberto = false;
        dispose();
    }//GEN-LAST:event_b_voltarActionPerformed

    private void b_sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_sobreActionPerformed
        Sobre sobre = new Sobre();
        
       if(sobre.isAberto() == false){
        sobre.setAberto(true);
        sobre.setVisible(true);
       }else if(sobre.isAberto() == true){
           
           JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);
           
       }
    }//GEN-LAST:event_b_sobreActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Opcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opcoes().setVisible(true);
                
              
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JP_Fundo;
    private javax.swing.JButton b_sair;
    private javax.swing.JButton b_sobre;
    private javax.swing.JButton b_voltar;
    private javax.swing.JDialog dialog;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel label_fundo_opcoes;
    private javax.swing.JLabel label_titulo_opcoes;
    // End of variables declaration//GEN-END:variables
}
