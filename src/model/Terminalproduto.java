/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "terminalproduto")
@NamedQueries({
    @NamedQuery(name = "Terminalproduto.findAll", query = "SELECT t FROM Terminalproduto t")})
public class Terminalproduto implements Serializable {
    @Column(name = "complemento")
    private String complemento;
    @Column(name = "valorColorante")
    private Double valorColorante;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idterminalProduto")
    private Integer idterminalProduto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quantidade")
    private Double quantidade;
    @Column(name = "valorUnitario")
    private Float valorUnitario;
    @Column(name = "terminalcliente_idterminalcliente")
    private int terminalcliente;
    @Column(name = "produto_idproduto")
    private int produto;
    @Column(name = "percentualDesconto")
    private float percentualDesconto;
    @Column(name = "vendedor_idvendedor")
    private int vendedor;
    

    public Terminalproduto() {
    }

    public Terminalproduto(Integer idterminalProduto) {
        this.idterminalProduto = idterminalProduto;
    }

    public Integer getIdterminalProduto() {
        return idterminalProduto;
    }

    public void setIdterminalProduto(Integer idterminalProduto) {
        this.idterminalProduto = idterminalProduto;
    }

    public int getVendedor() {
        return vendedor;
    }

    public void setVendedor(int vendedor) {
        this.vendedor = vendedor;
    }

    public float getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(float percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public int getTerminalcliente() {
        return terminalcliente;
    }

    public void setTerminalcliente(int terminalcliente) {
        this.terminalcliente = terminalcliente;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idterminalProduto != null ? idterminalProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Terminalproduto)) {
            return false;
        }
        Terminalproduto other = (Terminalproduto) object;
        if ((this.idterminalProduto == null && other.idterminalProduto != null) || (this.idterminalProduto != null && !this.idterminalProduto.equals(other.idterminalProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Terminalproduto[ idterminalProduto=" + idterminalProduto + " ]";
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Double getValorColorante() {
        return valorColorante;
    }

    public void setValorColorante(Double valorColorante) {
        this.valorColorante = valorColorante;
    }

}
