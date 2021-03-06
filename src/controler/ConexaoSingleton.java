/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Wolverine
 */
public class ConexaoSingleton {

    private static EntityManagerFactory emf = null;
    private static EntityManager manager = null;

    public static EntityManager getConexao() throws SQLException {
        if (manager == null) {
            Sigap utilitario = new Sigap();
            ConfiguracaoSistema configura = new ConfiguracaoSistema();
            configura = (ConfiguracaoSistema) utilitario.deserializarConfiguracao();
            Map mapa = new HashMap();
            mapa.put("hibernate.connection.url", "jdbc:mysql://" + configura.getBdlocal() + ":" + configura.getBdporta() + "/"
                    + configura.getBdNome());
            mapa.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
            mapa.put("hibernate.connection.password", configura.getBdSenha());
            mapa.put("hibernate.connection.username", configura.getBdusuario());
            mapa.put("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");
            mapa.put("hibernate.show_sql", "true");
            mapa.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

            try {
                emf = Persistence.createEntityManagerFactory("sModularPU", mapa);
                manager = emf.createEntityManager();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro " + e.getMessage());

            }

        }
        return manager;
    }
    
    
    public static void  desconectar(){
        manager.close();
    }
}