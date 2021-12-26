package ru.botgaydev.bot.service;

import ru.botgaydev.bot.dao.TransactionHistDao;
import ru.botgaydev.bot.entity.TransactionHist;

import java.util.List;

public class TransactionHistService {
    private static TransactionHistDao transactionHistDao;

    public TransactionHistService() {
        transactionHistDao = new TransactionHistDao();
    }

    public void persist(TransactionHist entity) {
        transactionHistDao.openCurrentSessionwithTransaction();
        transactionHistDao.persist(entity);
        transactionHistDao.closeCurrentSessionwithTransaction();
    }

    public void update(TransactionHist entity) {
        transactionHistDao.openCurrentSessionwithTransaction();
        transactionHistDao.update(entity);
        transactionHistDao.closeCurrentSessionwithTransaction();
    }

    public TransactionHist findById(Integer id) {
        transactionHistDao.openCurrentSession();
        TransactionHist acc = transactionHistDao.findById(id);
        transactionHistDao.closeCurrentSession();
        return acc;
    }

    public void delete(Integer id) {
        transactionHistDao.openCurrentSessionwithTransaction();
        TransactionHist acc = transactionHistDao.findById(id);
        transactionHistDao.delete(acc);
        transactionHistDao.closeCurrentSessionwithTransaction();
    }

    public List<TransactionHist> findAll() {
        transactionHistDao.openCurrentSession();
        List<TransactionHist> transactionHists = transactionHistDao.findAll();
        transactionHistDao.closeCurrentSession();
        return transactionHists;
    }

    public void deleteAll() {
        transactionHistDao.openCurrentSessionwithTransaction();
        transactionHistDao.deleteAll();
        transactionHistDao.closeCurrentSessionwithTransaction();
    }

    public TransactionHistDao transactionHistDao() {
        return transactionHistDao;
    }
}
