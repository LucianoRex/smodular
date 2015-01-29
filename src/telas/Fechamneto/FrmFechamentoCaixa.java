/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmAberturaCaixa.java
 *
 * Created on 29/10/2010, 11:26:25
 */

package telas.Fechamneto;


import Controller.FechaCaixaController;
import Controller.UsuariosController;
import Regras.Formatacao;
import Regras.UsuarioLogado;
import java.awt.Dialog.ModalExclusionType;
import java.sql.Time;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Fechacaixa;
import model.Usuarios;

/**
 *
 * @author Woverine
 */
public class FrmFechamentoCaixa extends javax.swing.JFrame {

    private JFrame telaVenda;
    private Fechacaixa fechaCaixa;
    UsuarioLogado usuarioLogado;
    
    
    /** Creates new form FrmAberturaCaixa */
    public FrmFechamentoCaixa(Fechacaixa fechaCaixa, JFrame telaVenda, UsuarioLogado usuarioLogado) {
        this.telaVenda = telaVenda;
        this.fechaCaixa = fechaCaixa;
        this.usuarioLogado = usuarioLogado;
        initComponents();
        datajTextField.setText(Formatacao.ConvercaoDataString(this.fechaCaixa.getDataFechamento(), "dd/MM/yyyy"));
        operadorjTextField.setText(usuarioLogado.getUsuario().getNome());
        this.setLocationRelativeTo(null);
        this.setModalExclusionType(ModalExclusionType.NO_EXCLUDE);
        this.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        datajTextField = new javax.swing.JTextField();
        operadorjTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        confirnajButton = new javax.swing.JButton();
        cancelajButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fechamento de Caixa");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 340, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 340, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Data Fechamento");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        datajTextField.setEditable(false);
        datajTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        datajTextField.setForeground(new java.awt.Color(102, 102, 102));
        datajTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        datajTextField.setText("20/09/2010");
        jPanel5.add(datajTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 160, -1));

        operadorjTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        operadorjTextField.setForeground(new java.awt.Color(102, 102, 102));
        operadorjTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        operadorjTextField.setEnabled(false);
        operadorjTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                operadorjTextFieldFocusGained(evt);
            }
        });
        jPanel5.add(operadorjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 35, 280, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Operador");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 80));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 60));

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirnajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tick.png"))); // NOI18N
        confirnajButton.setText("Confirmar");
        confirnajButton.setToolTipText("Confirma Fechamento de Caixa");
        confirnajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirnajButtonActionPerformed(evt);
            }
        });
        jPanel6.add(confirnajButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        cancelajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cross.png"))); // NOI18N
        cancelajButton.setText("Cancelar");
        cancelajButton.setToolTipText("Cancela Fechamento de Caixa");
        cancelajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelajButtonActionPerformed(evt);
            }
        });
        jPanel6.add(cancelajButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jButton1.setText("Conferir Cartões");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 390, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelajButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelajButtonActionPerformed

    @SuppressWarnings("static-access")
    private void confirnajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirnajButtonActionPerformed
        this.fechaCaixa.setValorFechamento(this.fechaCaixa.getValorAbertura());
        Time hora = new Time(new Date().getTime());
        this.fechaCaixa.setHoraFechamento(hora);
        this.fechaCaixa.setSituacao("CONFERIR");
        FechaCaixaController fechaCaixaController = new FechaCaixaController();
        fechaCaixa = fechaCaixaController.salvar(fechaCaixa);
        finalizarUsuario(fechaCaixa.getIdfechaCaixa());
    }//GEN-LAST:event_confirnajButtonActionPerformed

    private void operadorjTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_operadorjTextFieldFocusGained
        
    }//GEN-LAST:event_operadorjTextFieldFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new FrmMostrarCartoes();
    }//GEN-LAST:event_jButton1ActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelajButton;
    private javax.swing.JButton confirnajButton;
    private javax.swing.JTextField datajTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField operadorjTextField;
    // End of variables declaration//GEN-END:variables
public void finalizarUsuario(int idFechaCaixa){
        UsuariosController usuariosController = new UsuariosController();
        Usuarios usuarios = new Usuarios();
        usuarios = usuarioLogado.getUsuario();
        usuarios.setIdFechaCaixa(idFechaCaixa);
        usuariosController.salvarUsuario(usuarios);
        System.exit(0);
    }
}
