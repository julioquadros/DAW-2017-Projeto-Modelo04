/*
 * @Author: Julio Sergio Quadros dos Santos.
 * @Email: julioquadros@hotmail.com
 * @2017 - Todos os Direitos Reservados
 */
package br.edu.ifsul.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {

    private static EntityManagerFactory factory = null;
    private static EntityManager em = null;

    public static EntityManager getEntityManager() {
        if (factory == null) {
            factory = Persistence.createEntityManagerFactory("DAW-2017-Projeto-Modelo04PU");
        }
        if (em == null) {
            em = factory.createEntityManager();
        }
        return em;
    }

}
