package ru.botgaydev.bot.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.botgaydev.bot.entity.TransactionHist;

import java.util.List;

import static ru.botgaydev.bot.persistence.HibernateUtil.getSessionFactory;

public class TransactionDao implements DaoInterface<TransactionHist> {
    private Session currentSession;
    private Transaction currentTransaction;

    public TransactionDao() {

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

    public void persist(TransactionHist entity) {
        getCurrentSession().save(entity);
    }

    public void update(TransactionHist entity) {
        getCurrentSession().update(entity);
    }

    public TransactionHist findById(Integer id) {
        return (TransactionHist) getCurrentSession().get(TransactionHist.class, id);
    }

    public void delete(TransactionHist entity) {
        getCurrentSession().delete(entity);
    }

    @SuppressWarnings("unchecked")
    public List<TransactionHist> findAll() {
        return (List<TransactionHist>) getCurrentSession().createQuery("from TransactionHist").list();
    }

    public void deleteAll() {
        List<TransactionHist> entityList = findAll();
        for (TransactionHist entity : entityList) {
            delete(entity);
        }
    }
}
