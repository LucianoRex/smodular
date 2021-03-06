/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import controler.ConexaoSingleton;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Planoconta;

/**
 *
 * @author Wolverine
 */
public class PlanoContaDao {

    private EntityManager manager;

    public List<Planoconta> consultarPlanoconta(String descricao) throws Exception{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("SELECT p FROM Planoconta p WHERE p.descricao Like '%" + descricao + "%' order by p.descricao");
        List<Planoconta> listaPlanoContas = new ArrayList<Planoconta>();
        listaPlanoContas =  q.getResultList();
        manager.getTransaction().commit();
        return listaPlanoContas;
    }

    public List<Planoconta> consultarPlanoconta() throws Exception{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("SELECT p FROM Planoconta p order by p.descricao");
        List<Planoconta> listaPlanoContas = new ArrayList<Planoconta>();
        listaPlanoContas =  q.getResultList();
        manager.getTransaction().commit();
        return listaPlanoContas;
    }
    
    public Planoconta consultarPlanoconta(int idPlanoContas) throws Exception{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Planoconta planoContas = new Planoconta();
        Query q = manager.createQuery("SELECT p FROM Planoconta p where idPlanoconta=" + idPlanoContas);
        if (q.getResultList().size()>0){
            planoContas = (Planoconta) q.getSingleResult();
        }
        manager.getTransaction().commit();
        return planoContas;
    }
    
    public Planoconta consultarPlanocontaNuemroConta(String numeroConta) throws Exception{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Planoconta planoContas = new Planoconta();
        Query q = manager.createQuery("SELECT p FROM Planoconta p where p.numeroConta='" + numeroConta + "'");
        if (q.getResultList().size()>0){
            planoContas = (Planoconta) q.getSingleResult();
        }
        manager.getTransaction().commit();
        return planoContas;
    }



    public void excluirPlanoconta(Planoconta planoConta) throws  Exception{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        manager.merge(planoConta);
        //fechando uma transação
        manager.getTransaction().commit();
    }

    public void salvarPlanoconta(Planoconta Planoconta) throws Exception {
         manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        manager.merge(Planoconta);
        //fechando uma transação
        manager.getTransaction().commit();
    }
}
