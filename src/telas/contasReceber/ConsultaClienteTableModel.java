/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.contasReceber;

import model.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Wolverine
 */
public class ConsultaClienteTableModel extends AbstractTableModel{
    
    private List<Cliente> listaCliente;
    private String[] colunas ={"Cödigo", "Nome / Razão Social", "Fone Fixo", "Fone Celular", "E-mail" , "Situação"};

    public ConsultaClienteTableModel(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public int getRowCount() {
        return listaCliente.size();
    }

    public int getColumnCount() {
        return colunas.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaCliente.get(rowIndex).getIdcliente();
        }else if (columnIndex==1){
            return listaCliente.get(rowIndex).getNome();
        }else if (columnIndex==2){
            return listaCliente.get(rowIndex).getFoneFixo();
        }else if (columnIndex==3){
            return listaCliente.get(rowIndex).getFoneCelular();
        }else if (columnIndex==4){
            return listaCliente.get(rowIndex).getEmail();
        }else return listaCliente.get(rowIndex).getSituacao();
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex==0){
             return Integer.class;
         }else if (columnIndex==1){
             return  String.class;
         }else if (columnIndex==2){
             return String.class;
         }else if (columnIndex==3){
             return String.class;
         }else if (columnIndex==4){
             return String.class;
         }else return String.class;
    }
    
    
    
}
