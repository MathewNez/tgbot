package ru.botgaydev.bot.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.botgaydev.bot.entity.Good;

import java.util.List;

import static ru.botgaydev.bot.persistence.HibernateUtil.getSessionFactory;

public class GoodDao implements DaoInterface<Good, String> {
    private Session currentSession;
    private Transaction currentTransaction;

    public GoodDao() {

    }

    public Session openCurrentSession() {
        currentSession = getSessionFactory().openSession();
        return currentSession;
    }

    public Session openCurrentSessionwithTransaction() {
        currentSession = getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSession() {
        currentSession.close();
    }

    public void closeCurrentSessionwithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }
    public Session getCurrentSession() {
        return currentSession;
    }

    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }

    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }

    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }

    public void persist(Good entity) {
        getCurrentSession().save(entity);
    }

    public void update(Good entity) {
        getCurrentSession().update(entity);
    }

    public Good findById(String id) {
        return (Good) getCurrentSession().get(Good.class, id);
    }

    public void delete(Good entity) {
        getCurrentSession().delete(entity);
    }

    @SuppressWarnings("unchecked")
    public List<Good> findAll() {
        return (List<Good>) getCurrentSession().createQuery("from Good").list();
    }

    public void deleteAll() {
        List<Good> entityList = findAll();
        for (Good entity : entityList) {
            delete(entity);
        }
    }
}
