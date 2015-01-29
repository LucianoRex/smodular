/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Frmloguin.java
 *
 * Created on 26/10/2009, 23:52:37
 */

package telas.usuario;

import Controller.AcessoController;
import Controller.UsuariosController;
import Interface.FrmAberturaCaixa;
import Regras.Formatacao;
import Regras.UsuarioLogado;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.Usuarios;


/**
 *
 * @author Wolverine
 */
public class FrmLogin extends javax.swing.JFrame {

    private UsuarioLogado usuarioLogado;
    private int tenta =0;

    /** Creates new form Frmloguin */
    public FrmLogin() {
        this.usuarioLogado = new UsuarioLogado();
        initComponents();
     //   arquivoxml();
        URL url = this.getClass().getResource("/imagens/logo_mini.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        try{
            UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
        }catch (Exception e){
        }
        setVisible(true);

    }
    
   

    public int getTenta() {
        return tenta;
    }

    public void setTenta(int tenta) {
        this.tenta = tenta;
    }

    public boolean senhaScape(char[] s){
        String senha="";
        for (int i=0;i<s.length;i++){
            senha+= s[i];
        }
//        String data = Formatacao.getDataDoDia();
  //      int dia = Integer.parseInt(data.substring(8));
    //    int mes = Integer.parseInt(data.substring(5, 7));
      //  int ano = Integer.parseInt(data.substring(0,4));
        //String senhaPadrao = "00" + String.valueOf(dia+mes) + String.valueOf(ano);
       // if (senha.equalsIgnoreCase(senhaPadrao)){
         //   return true;
    //    }
        return false;

    }

    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginjPanel = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        senhajPasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        loginjButton = new javax.swing.JButton();
        sairjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nomejTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                botaoFechar(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setBorder(null);
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/key_go.png"))); // NOI18N
        jButton1.setToolTipText("Alterar Senha");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        loginjPanel.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 30, 20));

        senhajPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhajPasswordFieldActionPerformed(evt);
            }
        });
        loginjPanel.add(senhajPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, -1));

        jLabel1.setText("Senha de Acesso");
        loginjPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/door_in.png"))); // NOI18N
        loginjButton.setText("Login");
        loginjButton.setToolTipText("Login de Usuário");
        loginjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginjButtonActionPerformed(evt);
            }
        });
        jPanel3.add(loginjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, -1, -1));

        sairjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/door.png"))); // NOI18N
        sairjButton.setText("Sair");
        sairjButton.setToolTipText("Sair do Sistema");
        sairjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairjButtonfecharMovimentoCaixa(evt);
            }
        });
        jPanel3.add(sairjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 6, 80, -1));

        loginjPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 200, 40));

        jLabel2.setText("Nome do Usuário");
        loginjPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        loginjPanel.add(nomejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 130, -1));

        getContentPane().add(loginjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UsuariosController usuariosController = new UsuariosController();
        String senha = null;
        if (senhajPasswordField.getPassword().length > 0) {
            senha = Formatacao.criptografarSenha(senhajPasswordField.getPassword());
            this.usuarioLogado.setUsuario(usuariosController.consultarUsuario(nomejTextField.getText(), senha));
            if (usuarioLogado == null) {
                JOptionPane.showMessageDialog(null, "Usuario e/ou Senha não conferem");
            } else {
                new FrmAlterarSenha(usuarioLogado.getUsuario());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loginjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginjButtonActionPerformed
        char[] valida = senhajPasswordField.getPassword();
        if (valida.length>0) {
                UsuariosController usuariosController = new UsuariosController();
                String senha = null;
                senha = Formatacao.criptografarSenha(senhajPasswordField.getPassword());
                this.usuarioLogado.setUsuario(usuariosController.consultarUsuario(nomejTextField.getText(), senha));
                setTenta(getTenta() + 1);
                char[] vsenha = senhajPasswordField.getPassword();
                String valSenha = "";
                if (vsenha.length>2){
                    valSenha += vsenha[0];
                    valSenha += vsenha[1];
                }
                if (this.usuarioLogado == null) {
                JOptionPane.showMessageDialog(null, "Usuario e/ou Senha incorreta. Possui " + (5 - getTenta()));
                if (getTenta() >= 5) {
                    JOptionPane.showMessageDialog(null, "Numero de tentativas excedido");
                    System.exit(0);
                }
            } else {
                if (this.usuarioLogado.getUsuario() != null) {
                    if (!this.usuarioLogado.getUsuario().getSenha().equals(senha)) {
                        JOptionPane.showMessageDialog(null, "Senha incorreta. Possui " + (5 - getTenta()));
                        if (getTenta() >= 5) {
                            JOptionPane.showMessageDialog(null, "Numero de tentativas excedido");
                            System.exit(0);
                        }
                    } else {
                        carregarAcessoUsuario();
                        if (this.usuarioLogado.getAcesso().getSmodular() == 1) {
                            new FrmAberturaCaixa(this.usuarioLogado);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(rootPane, " Usuário sem Permissão de Acesso");
                            System.exit(0);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Usuário Invalido");
                }
            }
        } else
            JOptionPane.showMessageDialog(null, "Campo senha nulo");
}//GEN-LAST:event_loginjButtonActionPerformed

    private void sairjButtonfecharMovimentoCaixa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairjButtonfecharMovimentoCaixa
       System.exit(0);
}//GEN-LAST:event_sairjButtonfecharMovimentoCaixa

    private void botaoFechar(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_botaoFechar

    }//GEN-LAST:event_botaoFechar

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      
    }//GEN-LAST:event_formWindowClosing

    private void senhajPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhajPasswordFieldActionPerformed
        loginjButtonActionPerformed(evt);
    }//GEN-LAST:event_senhajPasswordFieldActionPerformed


    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
        }catch (Exception e){
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    
    /**
    * @param args the command line arguments
    */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton loginjButton;
    private javax.swing.JPanel loginjPanel;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JButton sairjButton;
    private javax.swing.JPasswordField senhajPasswordField;
    // End of variables declaration//GEN-END:variables

 public void carregarAcessoUsuario(){
        AcessoController acessoController = new AcessoController();
        this.usuarioLogado.setAcesso(acessoController.getAcessoUsuario(this.usuarioLogado.getUsuario().getIdusuarios()));
    }
}
