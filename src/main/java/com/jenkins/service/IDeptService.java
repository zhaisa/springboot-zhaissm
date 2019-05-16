package com.jenkins.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jenkins.bean.Dept;
@Service
public interface IDeptService {
	 public List<Dept> list() ;
}
