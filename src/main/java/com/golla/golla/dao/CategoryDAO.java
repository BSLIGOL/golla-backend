package com.golla.golla.dao;

import com.golla.golla.dto.CategoryDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryDAO {

    List<CategoryDTO> getAllCategories();

}
