package ru.botgaydev.bot.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.botgaydev.bot.entity.Account;

import java.util.List;

import static ru.botgaydev.bot.persistence.HibernateUtil.getSessionFactory;

public class AccountDao implements DaoInterface<Account> {
    private Session currentSession;
    private Transaction currentTransaction;

    public AccountDao() {

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

    public void persist(Account entity) {
        getCurrentSession().save(entity);
    }

    public void update(Account entity) {
        getCurrentSession().update(entity);
    }

    public Account findById(Integer id) {
        return (Account) getCurrentSession().get(Account.class, id);
    }

    public void delete(Account entity) {
        getCurrentSession().delete(entity);
    }

    @SuppressWarnings("unchecked")
    public List<Account> findAll() {
        return (List<Account>) getCurrentSession().createQuery("from Account").list();
    }

    public void deleteAll() {
        List<Account> entityList = findAll();
        for (Account entity : entityList) {
            delete(entity);
        }
    }
}
