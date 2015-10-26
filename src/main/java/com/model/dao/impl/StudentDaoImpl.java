package com.model.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crud.model.StudntModel;
import com.model.dao.StudentDAO;


@Repository
public class StudentDaoImpl  implements StudentDAO{

	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(StudntModel model) {
		session.openSession().save(model);	
	}
	
	@Override
	public List<StudntModel> list() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from student").list();
	}

	@Override
	public StudntModel getstudent(int studentID) {
		// TODO Auto-generated method stub
		return (StudntModel)session.openSession().get(StudntModel.class, studentID);
	}

	@Override
	public void delete(int Studentid) {
		session.getCurrentSession().delete(getstudent(Studentid));
		
	}

	@Override
	public void update(StudntModel model) {
		session.getCurrentSession().update(model);
		
	}


	

}
