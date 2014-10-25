package com.zyy.dao;

import java.util.List;

import com.zyy.bean.Student;

public interface StuDao {
	public final String SELECT="SELECT * FROM STU_TB";
	public final String FIND="SELECT * FROM STU_TB WHERE STU_ID=?";
	public final String DELETE="DELETE FROM STU_TB WHERE STU_ID=?";
	
	public List<Student> stuSelect();
	public Student stuFind(int id);
	public int stuDelete(int id);
	public int stuUpdate(Student stu);
	public void stuInsert(Student stu);
}
