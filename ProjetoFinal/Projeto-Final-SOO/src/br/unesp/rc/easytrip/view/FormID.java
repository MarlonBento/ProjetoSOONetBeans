/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.easytrip.view;

import br.unesp.rc.easytrip.model.Funcionario;
import br.unesp.rc.easytrip.model.Usuario;
import br.unesp.rc.easytrip.model.Viagem;
import br.unesp.rc.easytrip.dao.FuncionarioDAO;
import br.unesp.rc.easytrip.dao.UsuarioDAO;
import br.unesp.rc.easytrip.dao.ViagemDAO;

/**
 *
 * @author Marlo
 */
public class FormID extends javax.swing.JFrame {

    /**
     * Creates new form FormID
     */
    String opcao;
    public FormID(String acao) {
        opcao = acao;
        System.out.println(opcao);
        initComponents();
    }

    private FormID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ConfirmarId = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        ConfirmarId.setText("Confirmar");
        ConfirmarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(ConfirmarId, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(ConfirmarId)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarIdActionPerformed
         Integer id;
        id = Integer.parseInt(idField.getText());
               
                switch(opcao){
                    case "AlterarF":
                        FuncionarioFormView fv = new FuncionarioFormView(0, id);
                        setVisible(false);
                        fv.setVisible(true);
                        break;   
                    case "DeletarF":
                        FuncionarioDAO.delete(id);
                        setVisible(false);
                        Principal principal = new Principal();
                        principal.setVisible(true);
                        break;
                    case "BuscarF":   
                        BuscaFuncionario bf = new BuscaFuncionario(FuncionarioDAO.read(id));
                        setVisible(false);
                        bf.setVisible(true);
                        
                        
                        
                        break;    
                    case "AddVeic":
                       VeiculoFormView vfv = new VeiculoFormView(id);
                       setVisible(false);
                       vfv.setVisible(true);
                        break;
                        
                    case "AlterarU":
                        UsuarioFormView ufv = new UsuarioFormView(0, id);
                        setVisible(false);
                        ufv.setVisible(true);
                        break;   
                        
                    case "DeletarU":
                        UsuarioDAO.delete(id);
                        setVisible(false);
                        principal = new Principal();
                        principal.setVisible(true);
                        break;
                    
                    case "BuscarU":
                        BuscaUsuario bu = new BuscaUsuario(UsuarioDAO.read(id));
                        setVisible(false);
                        bu.setVisible(true);
                        break;
                        
                    case "addEnd":
                        EnderecoFormView efv = new EnderecoFormView(id);
                        setVisible(false);
                        efv.setVisible(true);
                        break;
                    
                  
                        
                    case "BuscarViagem":
                            BuscaViagem bv = new BuscaViagem(ViagemDAO.read(id));
                            setVisible(false);
                            bv.setVisible(true);
                        break;    
                        
                }
    }//GEN-LAST:event_ConfirmarIdActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

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
            java.util.logging.Logger.getLogger(FormID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormID().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmarId;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
