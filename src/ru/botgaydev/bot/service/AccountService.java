package ru.botgaydev.bot.service;

import ru.botgaydev.bot.dao.AccountDao;
import ru.botgaydev.bot.entity.Account;

import java.util.List;

public class AccountService {
    private static AccountDao accountDao;
//    private static GoodDao goodDao;
//    private static TransactionDao transactionDao;

    public AccountService() {
        accountDao = new AccountDao();
//        goodDao = new GoodDao();
//        transactionDao = new TransactionDao();
    }

    public void persist(Account entity) {
        accountDao.openCurrentSessionwithTransaction();
        accountDao.persist(entity);
        accountDao.closeCurrentSessionwithTransaction();
    }

    public void update(Account entity) {
        accountDao.openCurrentSessionwithTransaction();
        accountDao.update(entity);
        accountDao.closeCurrentSessionwithTransaction();
    }

    public Account findById(Integer id) {
        accountDao.openCurrentSession();
        Account acc = accountDao.findById(id);
        accountDao.closeCurrentSession();
        return acc;
    }

    public void delete(Integer id) {
        accountDao.openCurrentSessionwithTransaction();
        Account acc = accountDao.findById(id);
        accountDao.delete(acc);
        accountDao.closeCurrentSessionwithTransaction();
    }

    public List<Account> findAll() {
        accountDao.openCurrentSession();
        List<Account> accounts = accountDao.findAll();
        accountDao.closeCurrentSession();
        return accounts;
    }

    public void deleteAll() {
        accountDao.openCurrentSessionwithTransaction();
        accountDao.deleteAll();
        accountDao.closeCurrentSessionwithTransaction();
    }

    public AccountDao accountDao() {
        return accountDao;
    }

//    public GoodDao goodDao() {
//        return goodDao;
//    }
//
//    public TransactionDao transactionDao() {
//        return transactionDao;
//    }
}
