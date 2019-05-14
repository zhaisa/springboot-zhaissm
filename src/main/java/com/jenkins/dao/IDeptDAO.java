package com.jenkins.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jenkins.bean.Dept;
@Mapper
public interface IDeptDAO {
	 public List<Dept> findAll() ;
}
