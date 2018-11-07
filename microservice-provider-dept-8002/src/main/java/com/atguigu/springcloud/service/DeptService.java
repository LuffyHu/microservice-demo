package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entity.Dept;

import java.util.List;

/**
 * @author Draghu
 * @date 2018/11/6 17:43
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
