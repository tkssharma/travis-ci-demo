package com.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.StudntModel;
import com.model.dao.StudentDAO;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentdao;

	@Transactional
	
	public void add(StudntModel model) {
		studentdao.add(model);

	}
	
	@Transactional
	public List<StudntModel> list() {
		studentdao.list();
		return null;
	}
	@Transactional
	public StudntModel getstudent(int studentID) {
		studentdao.getstudent(studentID);
		return null;
	}
	@Transactional
	public void delete(int Studentid) {
		studentdao.delete(Studentid);
		
	}

	@Transactional
	public void update(StudntModel model) {
		studentdao.update(model);
		
	}

}
