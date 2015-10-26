package com.model.service;

import java.util.List;

import com.crud.model.StudntModel;

public interface StudentService {

	public void add(StudntModel model);
	public void delete(int Studentid);
	public void update(StudntModel model);
	public List<StudntModel> list();
	public StudntModel getstudent(int studentID);
	
}
