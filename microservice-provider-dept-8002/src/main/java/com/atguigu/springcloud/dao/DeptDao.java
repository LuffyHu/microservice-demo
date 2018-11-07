package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Draghu
 * @date 2018/11/6 17:34
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
