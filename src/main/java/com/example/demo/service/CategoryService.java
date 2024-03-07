package com.example.demo.service;

import com.example.demo.common.DataNotFoundException;
import com.example.demo.dao.BaseDao;
import com.example.demo.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryService implements BaseService<Category> {
    @Autowired
    private BaseDao<Category> categoryDao;

    @Override
    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    @Override
    public Category findById(Integer id) throws DataNotFoundException {
        return categoryDao.findById(id);
    }

    @Override
    public void save(Category category) {
        categoryDao.save(category);
    }

    @Override
    public void delete(Integer id) {
        categoryDao.delete(id);
    }

}
