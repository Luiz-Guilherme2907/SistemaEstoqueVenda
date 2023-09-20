/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.VendaController;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author GUI
 */
public class DeletarVenda extends javax.swing.JFrame {

    private static boolean aberto = false;

    private final VendaController controller;

    TelaPrincipal TP = new TelaPrincipal();

    public DeletarVenda() {
        initComponents();

        if (TP.getTema() == true) {

            label_fundo_DF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_registro_4.png")));

        } else if (TP.getTema() == false) {

            label_fundo_DF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_preto_registro_4.png")));

        }

        controller = new VendaController(this);

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

        JP_Fundo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jDevolver = new javax.swing.JButton();
        b_voltar = new javax.swing.JButton();
        panelLaranja = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        txtNomeAmigos = new javax.swing.JTextField();
        txtNomeFerramenta = new javax.swing.JTextField();
        txtDataEmprestimo = new javax.swing.JTextField();
        txtDataDevolcao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        label_fundo_DF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(910, 400));

        JP_Fundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 119, 197));
        jPanel1.setOpaque(false);

        jDevolver.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jDevolver.setText("Deletar");
        jDevolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jDevolver.setFocusPainted(false);
        jDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDevolverActionPerformed(evt);
            }
        });

        b_voltar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        b_voltar.setText("Voltar");
        b_voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_voltar.setFocusPainted(false);
        b_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(b_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDevolver)
                    .addComponent(b_voltar))
                .addContainerGap())
        );

        JP_Fundo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, 42));

        panelLaranja.setBackground(new java.awt.Color(235, 120, 3));
        panelLaranja.setOpaque(false);
        panelLaranja.setPreferredSize(new java.awt.Dimension(475, 183));

        txtId.setVisible(false);
        txtId.setText("NÃO MEXER NESTE BOTÃO");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setText("Nome do produto:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("Valor:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("Data da Venda:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setText("Quantidade:");

        javax.swing.GroupLayout panelLaranjaLayout = new javax.swing.GroupLayout(panelLaranja);
        panelLaranja.setLayout(panelLaranjaLayout);
        panelLaranjaLayout.setHorizontalGroup(
            panelLaranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLaranjaLayout.createSequentialGroup()
                .addGroup(panelLaranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLaranjaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLaranjaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(txtNomeAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLaranjaLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(txtNomeFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLaranjaLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataDevolcao, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLaranjaLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(txtDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(152, 152, 152))
        );
        panelLaranjaLayout.setVerticalGroup(
            panelLaranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLaranjaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(panelLaranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLaranjaLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtNomeAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(panelLaranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLaranjaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(txtNomeFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelLaranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataDevolcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelLaranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        JP_Fundo.add(panelLaranja, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 456, 223));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        JP_Fundo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 400));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        JP_Fundo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 5));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        JP_Fundo.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(905, 0, 5, 400));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        JP_Fundo.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 395, 910, 5));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Deletar Venda");
        JP_Fundo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 450, 60));

        label_fundo_DF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_registro_4.png"))); // NOI18N
        JP_Fundo.add(label_fundo_DF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 400));

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

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }


    private void jDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDevolverActionPerformed
        controller.deleteVenda();
        aberto = false;
        dispose();
    }//GEN-LAST:event_jDevolverActionPerformed

    private void b_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_voltarActionPerformed
        this.aberto = false;
        dispose();
    }//GEN-LAST:event_b_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(DeletarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeletarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeletarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeletarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeletarVenda().setVisible(true);
            }
        });
    }

    private TelaPrincipal principalAxu;

    public void setPrincipal(TelaPrincipal principal) {
        this.principalAxu = principal;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JP_Fundo;
    private javax.swing.JButton b_voltar;
    private javax.swing.JButton jDevolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel label_fundo_DF;
    private javax.swing.JPanel panelLaranja;
    private javax.swing.JTextField txtDataDevolcao;
    private javax.swing.JTextField txtDataEmprestimo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomeAmigos;
    private javax.swing.JTextField txtNomeFerramenta;
    // End of variables declaration//GEN-END:variables

    public JButton getjDevolver() {
        return jDevolver;
    }

    public void setjDevolver(JButton jDevolver) {
        this.jDevolver = jDevolver;
    }

    public JTextField getTxtDataDevolcao() {
        return txtDataDevolcao;
    }

    public void setTxtDataDevolcao(JTextField txtDataDevolcao) {
        this.txtDataDevolcao = txtDataDevolcao;
    }

    public JTextField getTxtDataEmprestimo() {
        return txtDataEmprestimo;
    }

    public void setTxtDataEmprestimo(JTextField txtDataEmprestimo) {
        this.txtDataEmprestimo = txtDataEmprestimo;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNomeAmigos() {
        return txtNomeAmigos;
    }

    public void setTxtNomeAmigos(JTextField txtNomeAmigos) {
        this.txtNomeAmigos = txtNomeAmigos;
    }

    public JTextField getTxtNomeFerramenta() {
        return txtNomeFerramenta;
    }

    public void setTxtNomeFerramenta(JTextField txtNomeFerramenta) {
        this.txtNomeFerramenta = txtNomeFerramenta;
    }

}
