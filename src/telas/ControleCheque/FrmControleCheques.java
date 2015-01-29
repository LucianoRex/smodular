/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.ControleCheque;

import Controller.ClienteController;
import Controller.ControleChequeController;
import Regras.Config;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import model.Chequefechacaixa;
import model.Cliente;
import model.Controlecheques;
import model.Fechacaixa;
import model.Municipios;


/**
 *
 * @author wolverine
 */
public class FrmControleCheques extends javax.swing.JFrame implements IControleCheques{
    
    
    private ControleChequesTableModel model;
    private List<ControleChequeBean> listaCheqque;
    private Config config;
    private Fechacaixa fechacaixa;
    
    /**
     * Creates new form FrmControleCheques
     */
    public FrmControleCheques(Config config, Fechacaixa fechaCaixa) {
        this.config = config;
        this.fechacaixa = fechaCaixa;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo_mini.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarListaCheques(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        controleChequesjTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de Cheques");

        controleChequesjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        controleChequesjTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                controleChequesjTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(controleChequesjTable);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Fechar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(78, 78, 78)
                .addComponent(jButton3)
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void controleChequesjTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_controleChequesjTableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (this.listaCheqque == null) {
                listaCheqque = new ArrayList<ControleChequeBean>();
            }
            int linha = controleChequesjTable.getSelectedRow();
            if (linha >= 0) {
                if (listaCheqque.get(linha).getMarcado().equalsIgnoreCase("NÃO")){
                    listaCheqque.get(linha).setMarcado("SIM");
                }else {
                    listaCheqque.get(linha).setMarcado("NÃO");
                }
            }
        }

    }//GEN-LAST:event_controleChequesjTableKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new FrmCadastrarCheques(fechacaixa, this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int linha = controleChequesjTable.getSelectedRow();
        if (linha>=0){
            excluirChequesCaixa(listaCheqque.get(linha));     
        }else JOptionPane.showMessageDialog(rootPane, "Selecione um cheque");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable controleChequesjTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void carregarListaCheques(String sql){
        ControleChequeController controleChequeController = new ControleChequeController();
        List<Chequefechacaixa> listaChequesCaixa = controleChequeController.ListaChequesCaixa(fechacaixa.getIdfechaCaixa());
        if (listaChequesCaixa!=null){
            listaCheqque = new ArrayList<ControleChequeBean>();
            ClienteController clienteController = new ClienteController();
            for(int i=0;i<listaChequesCaixa.size();i++){
                Controlecheques controlecheques = new Controlecheques();
                controlecheques = controleChequeController.listarChequesid(listaChequesCaixa.get(i).getControlecheques());
                if (controlecheques!=null){
                    Cliente cliente = clienteController.consultarClienteId(controlecheques.getCliente());
                    if (cliente!=null){
                        ControleChequeBean controleChequeBean = new ControleChequeBean();
                        controleChequeBean.setCheque(controlecheques);
                        controleChequeBean.setCliente(cliente);
                        listaCheqque.add(controleChequeBean);
                    }
                }
            }
        }
        carregarModel();
    }
    
    public void carregarModel(){
        
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.RIGHT);
        if (listaCheqque==null){
            listaCheqque = new ArrayList<ControleChequeBean>();
        }
        model = new ControleChequesTableModel(listaCheqque);
        controleChequesjTable.setModel(model);
        controleChequesjTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        controleChequesjTable.getColumnModel().getColumn(1).setPreferredWidth(300);
        controleChequesjTable.getColumnModel().getColumn(2).setPreferredWidth(40);
        controleChequesjTable.getColumnModel().getColumn(3).setPreferredWidth(40);
        controleChequesjTable.getColumnModel().getColumn(4).setCellRenderer(renderer);
        controleChequesjTable.getColumnModel().getColumn(4).setPreferredWidth(40);
        controleChequesjTable.repaint();
    }
    
    public void excluirChequesCaixa(ControleChequeBean cheque){
        ControleChequeController controleChequeController = new ControleChequeController();
        Chequefechacaixa chequefechacaixa = controleChequeController.ListaChequesCaixaid(cheque.getCheque().getIdControleCheques());
        if (chequefechacaixa!=null){
            controleChequeController.excluirControleChequeFechaCaixa(chequefechacaixa);
        }
        controleChequeController.excluirControleCheque(cheque.getCheque());
        carregarListaCheques(null);
    }

    public void setModelCehques() {
        carregarListaCheques(null);
    }


    public void setMunicipios(Municipios municipios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
