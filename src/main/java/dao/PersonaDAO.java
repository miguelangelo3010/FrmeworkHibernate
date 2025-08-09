package dao;

import model.Persona;
import util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class PersonaDAO {

    public List<Persona> obtenerPersonas() {
        Transaction tx = null;
        List<Persona> listaPersonas = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            listaPersonas = session.createQuery("from Persona", Persona.class).list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }

        return listaPersonas;
    }
}
