/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmCadastrarClienteTerminal.java
 *
 * Created on 08/11/2010, 13:19:54
 */

package Interface;

import Regras.Config;
import Regras.Formatacao;
import Regras.ProdutoVenda;
import controler.ItelaVenda;
import facade.FormaPagamentoFacade;
import facade.TerminalVendasFacade;
import facade.VendedorFacade;
import java.awt.Component;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import model.Formapagamento;
import model.Terminalcliente;
import model.Terminalproduto;
import model.Vendedor;

/**
 *
 * @author Woverine
 */
public class FrmCadastrarClienteTerminal extends javax.swing.JFrame {

    private TerminalVendasTableModel model;
    private DefaultTableCellRenderer renderer;
    private List<Terminalcliente> listaTerminalCliente;
    private List<ProdutoVenda> listaProdutoVenda;
    private ItelaVenda telaVendas;
    private Config config;

    /** Creates new form FrmCadastrarClienteTerminal */
    public FrmCadastrarClienteTerminal(List<ProdutoVenda> listaProdutoVenda, ItelaVenda telaVendas, String subTotal, Config config) throws Exception {
        this.renderer = new DefaultTableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {

                String valorFormatado;
                if (value instanceof Double) {
                    Double valor = (Double) value;

                    NumberFormat format = NumberFormat.getCurrencyInstance();
                    format.setMinimumFractionDigits(3);
                    valorFormatado = format.format(valor);
                } else if (value instanceof Float) {
                    Float valor = (Float) value;

                    NumberFormat format = NumberFormat.getCurrencyInstance();
                    format.setMinimumFractionDigits(2);
                    valorFormatado = format.format(valor);
                } else {
                    valorFormatado = value.toString();
                }

                Component comp = super.getTableCellRendererComponent(table, valorFormatado,
                        isSelected, hasFocus, row, column);

                return comp;
            }
        };
        this.config = config;
        renderer.setHorizontalAlignment(SwingConstants.RIGHT);
        listaTerminalCliente = new ArrayList<Terminalcliente>();
        listaTerminalCliente = new TerminalVendasFacade().consultaTerminalCliente();
        model = new TerminalVendasTableModel(listaTerminalCliente);
        initComponents();
        this.setLocationRelativeTo(null);
        CarregarComboBox();
        gerarTableModel();
        this.listaProdutoVenda = listaProdutoVenda;
        this.telaVendas = telaVendas;
        valorTotaljFormattedTextField.setText(subTotal);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomejTextField = new javax.swing.JTextField();
        vendedorjComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        formaPagamentojComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        valorDescontojFormattedTextField = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        valorAcrescimojFormattedTextField = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        valorTotaljFormattedTextField = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaClientesjTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Cliente Terminal de Vendas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nome");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel2.add(nomejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, 190, -1));

        jPanel2.add(vendedorjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 25, 170, -1));

        jLabel2.setText("Vendedor");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jPanel2.add(formaPagamentojComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 25, 190, -1));

        jLabel3.setText("Forma de Pagamento");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jLabel4.setText("Valor Desconto");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        valorDescontojFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        valorDescontojFormattedTextField.setText("0,00");
        valorDescontojFormattedTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        valorDescontojFormattedTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                valorDescontojFormattedTextFieldFocusGained(evt);
            }
        });
        jPanel2.add(valorDescontojFormattedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, 110, -1));

        jLabel5.setText("Valor Acrescimo");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        valorAcrescimojFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        valorAcrescimojFormattedTextField.setText("0,00");
        valorAcrescimojFormattedTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        valorAcrescimojFormattedTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                valorAcrescimojFormattedTextFieldFocusGained(evt);
            }
        });
        jPanel2.add(valorAcrescimojFormattedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 75, 110, -1));

        jLabel6.setText("Valor Total");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        valorTotaljFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        valorTotaljFormattedTextField.setText("0,00");
        valorTotaljFormattedTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        valorTotaljFormattedTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                valorTotaljFormattedTextFieldFocusGained(evt);
            }
        });
        jPanel2.add(valorTotaljFormattedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 75, 110, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 100));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 350, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaClientesjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Forma Pagamento", "Vendedor", "Valor"
            }
        ));
        jScrollPane3.setViewportView(listaClientesjTable);
        listaClientesjTable.getColumnModel().getColumn(0).setPreferredWidth(200);
        listaClientesjTable.getColumnModel().getColumn(1).setPreferredWidth(50);
        listaClientesjTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        listaClientesjTable.getColumnModel().getColumn(3).setResizable(false);
        listaClientesjTable.getColumnModel().getColumn(3).setPreferredWidth(8);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 620, 250));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 640, 260));

        jMenu1.setText("Menu de Teclas");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        jMenuItem1.setText("Confirmar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem2.setText("Cancela");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Terminalcliente terminalCliente = new Terminalcliente();
        terminalCliente.setEmpresa(config.getEmpresa().getIdempresa());
        terminalCliente.setNome(nomejTextField.getText());
        Formapagamento formaPagamento = (Formapagamento)formaPagamentojComboBox.getSelectedItem();
        terminalCliente.setFormapagamento(formaPagamento.getIdformaPagamento());
        Vendedor vendedor = (Vendedor) vendedorjComboBox.getSelectedItem();
        terminalCliente.setVendedor(vendedor.getIdvendedor());
        terminalCliente.setValorDesconto(Formatacao.formatarStringfloat(valorDescontojFormattedTextField.getText()));
        terminalCliente.setAcrescimo(Formatacao.formatarStringfloat(valorAcrescimojFormattedTextField.getText()));
        terminalCliente.setValorCompra(Formatacao.formatarStringfloat(valorTotaljFormattedTextField.getText()));
        TerminalVendasFacade terminalVendasFacade = new TerminalVendasFacade();
        try {
            terminalVendasFacade.salvarCliente(terminalCliente);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar Cliente Terminal");
            Logger.getLogger(FrmCadastrarClienteTerminal.class.getName()).log(Level.SEVERE, null, ex);
        }
        int idTerminalCliente =0;
        try {
            idTerminalCliente = terminalVendasFacade.ultimoTerminalClienteGravada();
        } catch (Exception ex) {
            Logger.getLogger(FrmCadastrarClienteTerminal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            terminalCliente = terminalVendasFacade.getTerminalCliente(idTerminalCliente);
        } catch (Exception ex) {
            Logger.getLogger(FrmCadastrarClienteTerminal.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0;i<listaProdutoVenda.size();i++){
            Terminalproduto terminalProduto = new Terminalproduto();
            terminalProduto.setProduto(listaProdutoVenda.get(i).getProduto().getIdProduto());
            terminalProduto.setQuantidade((listaProdutoVenda.get(i).getQuantidade()));
            terminalProduto.setValorUnitario(listaProdutoVenda.get(i).getValorUnitario());
            terminalProduto.setTerminalcliente(terminalCliente.getIdterminalCliente());
            terminalProduto.setVendedor(listaProdutoVenda.get(i).getVendedor());
            terminalProduto.setValorColorante(0.0);
            try {
               terminalVendasFacade.salvarProduto(terminalProduto);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro Salvar Produto Terminal");
                Logger.getLogger(FrmCadastrarClienteTerminal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.telaVendas.finalizarCadastroTeminalCliente();
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void valorDescontojFormattedTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorDescontojFormattedTextFieldFocusGained
        valorDescontojFormattedTextField.selectAll();
    }//GEN-LAST:event_valorDescontojFormattedTextFieldFocusGained

    private void valorAcrescimojFormattedTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorAcrescimojFormattedTextFieldFocusGained
        valorAcrescimojFormattedTextField.selectAll();
    }//GEN-LAST:event_valorAcrescimojFormattedTextFieldFocusGained

    private void valorTotaljFormattedTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorTotaljFormattedTextFieldFocusGained
        valorAcrescimojFormattedTextField.selectAll();
    }//GEN-LAST:event_valorTotaljFormattedTextFieldFocusGained

    /**
    * @param args the command line arguments
    */
   public void CarregarComboBox() throws Exception{
        List<Vendedor> listaVendedor = new ArrayList<Vendedor>();
        listaVendedor = new VendedorFacade().consultarVendedor();
        vendedorjComboBox.removeAllItems();
        for(int i=0;i<listaVendedor.size();i++){
            vendedorjComboBox.addItem(listaVendedor.get(i));
        }
        List<Formapagamento> listaFormapagamento = new ArrayList<Formapagamento>();
        listaFormapagamento = new FormaPagamentoFacade().getFormaPagamento();
        for(int i=0;i<listaFormapagamento.size();i++){
            formaPagamentojComboBox.addItem(listaFormapagamento.get(i));
        }
   }

   public void gerarTableModel(){
        model = new TerminalVendasTableModel(this.listaTerminalCliente);
        this.setLocationRelativeTo(this);
        listaClientesjTable.setModel(model);
        listaClientesjTable.getColumnModel().getColumn(0).setPreferredWidth(200);
        listaClientesjTable.getColumnModel().getColumn(1).setPreferredWidth(50);
        listaClientesjTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        listaClientesjTable.getColumnModel().getColumn(3).setPreferredWidth(8);
        listaClientesjTable.setDefaultRenderer(Float.class, renderer);
        listaClientesjTable.repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox formaPagamentojComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable listaClientesjTable;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JFormattedTextField valorAcrescimojFormattedTextField;
    private javax.swing.JFormattedTextField valorDescontojFormattedTextField;
    private javax.swing.JFormattedTextField valorTotaljFormattedTextField;
    private javax.swing.JComboBox vendedorjComboBox;
    // End of variables declaration//GEN-END:variables

}
