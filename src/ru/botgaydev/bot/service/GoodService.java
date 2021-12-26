package ru.botgaydev.bot.service;

import ru.botgaydev.bot.dao.GoodDao;
import ru.botgaydev.bot.entity.Good;

import java.util.List;

public class GoodService {
    private static GoodDao goodDao;

    public GoodService() {
        goodDao = new GoodDao();
    }

    public void persist(Good entity) {
        goodDao.openCurrentSessionwithTransaction();
        goodDao.persist(entity);
        goodDao.closeCurrentSessionwithTransaction();
    }

    public void update(Good entity) {
        goodDao.openCurrentSessionwithTransaction();
        goodDao.update(entity);
        goodDao.closeCurrentSessionwithTransaction();
    }

    public Good findById(Integer id) {
        goodDao.openCurrentSession();
        Good acc = goodDao.findById(id);
        goodDao.closeCurrentSession();
        return acc;
    }

    public void delete(Integer id) {
        goodDao.openCurrentSessionwithTransaction();
        Good acc = goodDao.findById(id);
        goodDao.delete(acc);
        goodDao.closeCurrentSessionwithTransaction();
    }

    public List<Good> findAll() {
        goodDao.openCurrentSession();
        List<Good> goods = goodDao.findAll();
        goodDao.closeCurrentSession();
        return goods;
    }

    public void deleteAll() {
        goodDao.openCurrentSessionwithTransaction();
        goodDao.deleteAll();
        goodDao.closeCurrentSessionwithTransaction();
    }

    public GoodDao goodDao() {
        return goodDao;
    }
}
