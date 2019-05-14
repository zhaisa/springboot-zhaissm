package com.jenkins.service;

import java.util.List;

import javax.annotation.Resource;

import com.jenkins.bean.Dept;
import com.jenkins.dao.IDeptDAO;

public class DeptServiceImpl implements IDeptService{
	 @Resource
	    private IDeptDAO deptDAO;
	@Override
	public List<Dept> list() {
		// TODO Auto-generated method stub
		  return this.deptDAO.findAll();
	}

}
