package com.partTi.service.recruit.impl;

import com.partTi.dao.recruit.CategoryDao;
import com.partTi.pojo.recruit.Category;
import com.partTi.service.recruit.CategoryService;
import com.partTi.utils.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public ResponseDate getAllCategory() {
        List<Category> categories = categoryDao.getAllCategory();
        if (categories != null){
            return new ResponseDate(200,"查询职位分类成功",categories);
        }else {
            return new ResponseDate(444,"查询职位分类失败");
        }
    }

    @Override
    public ResponseDate getCategoryById(Integer id) {
        Category category = categoryDao.getCategoryById(id);
        if (category != null){
            return new ResponseDate(200,"查询职位分类成功",category);
        }else {
            return new ResponseDate(444,"查询职位分类失败");
        }
    }
}
