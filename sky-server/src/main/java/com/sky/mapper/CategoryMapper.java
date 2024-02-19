package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CategoryMapper {
    Page<Category> pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);

    @Select("select id, type, name, sort, status, create_time, update_time, create_user, update_user from category where name = #{name}")
    Category getByName(String name);

    @Insert("insert into category (id, type, name, sort, status, create_time, update_time, create_user, update_user) " +
            "values (#{id}, #{type}, #{name}, #{sort}, #{status}, #{createTime}, #{updateTime}, #{createUser}, #{updateUser});")
    void save(Category category);
}
