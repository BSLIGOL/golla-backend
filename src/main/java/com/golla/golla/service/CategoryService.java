package com.golla.golla.service;

import com.golla.golla.dao.CategoryDAO;
import com.golla.golla.dto.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryService {

    private final CategoryDAO categoryDAO;

    @Autowired
    public CategoryService(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    public List<CategoryDTO> getAllCategories() {
        return categoryDAO.getAllCategories();
    }
}
