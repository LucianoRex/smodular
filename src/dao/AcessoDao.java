/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import controler.ConexaoSingleton;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Acesso;

/**
 *
 * @author Wolverine
 */
public class AcessoDao {
    
    private EntityManager manager;
    
    public Acesso getAcessoUsuario(int idUsuario) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        Query q = manager.createQuery("select a from Acesso a where a.usuarios=" + idUsuario);
        if (q.getResultList().size()>0){
            return (Acesso) q.getSingleResult();
        }
        return null;
    }
    
}
