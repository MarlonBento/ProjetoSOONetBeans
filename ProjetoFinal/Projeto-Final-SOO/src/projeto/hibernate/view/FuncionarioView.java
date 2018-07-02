/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.hibernate.view;





/**
 *
 * @author Byte
 */
public class FuncionarioView extends javax.swing.JFrame {

    /**
     * Creates new form Restrito
     */
    public FuncionarioView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InserirF = new javax.swing.JButton();
        AlterarF = new javax.swing.JButton();
        RemoverF = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AddV = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        BuscarF1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InserirF.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        InserirF.setText("Inserir Novo Funcionario");
        InserirF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirFActionPerformed(evt);
            }
        });

        AlterarF.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        AlterarF.setText("Alterar Funcionario");
        AlterarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarFActionPerformed(evt);
            }
        });

        RemoverF.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        RemoverF.setText("Remover Funcionario");
        RemoverF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverFActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" MENU FUNCIONARIO");

        AddV.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        AddV.setActionCommand("Adicionar Veiculo");
        AddV.setLabel("Adicionar Veiculo");
        AddV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddVActionPerformed(evt);
            }
        });

        jButton6.setText("Voltar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        BuscarF1.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        BuscarF1.setText("Buscar Funcionario");
        BuscarF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarF1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AlterarF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RemoverF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InserirF, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(BuscarF1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(10, 10, 10)
                .addComponent(InserirF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AlterarF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RemoverF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BuscarF1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InserirFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirFActionPerformed
        FuncionarioFormView FForm = new FuncionarioFormView(1, 0);
        setVisible(false);
        FForm.setVisible(true);
     
    }//GEN-LAST:event_InserirFActionPerformed

    private void AlterarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarFActionPerformed
        FormID fID = new FormID("AlterarF");
        setVisible(false);
        fID.setVisible(true);
    }//GEN-LAST:event_AlterarFActionPerformed

    private void RemoverFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverFActionPerformed
        FormID fID = new FormID("DeletarF");
        setVisible(false);
        fID.setVisible(true);
    }//GEN-LAST:event_RemoverFActionPerformed

    private void AddVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddVActionPerformed
         FormID fID = new FormID("AddVeic");
         setVisible(false);
         fID.setVisible(true);
    }//GEN-LAST:event_AddVActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     setVisible(false);
     Inicial inicial = new Inicial();   
     inicial.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void BuscarF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarF1ActionPerformed
        FormID fID = new FormID("BuscarF");
         setVisible(false);
         fID.setVisible(true);
    }//GEN-LAST:event_BuscarF1ActionPerformed

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
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddV;
    private javax.swing.JButton AlterarF;
    private javax.swing.JButton BuscarF1;
    private javax.swing.JButton InserirF;
    private javax.swing.JButton RemoverF;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
