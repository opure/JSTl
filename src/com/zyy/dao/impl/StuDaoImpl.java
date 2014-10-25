package com.zyy.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zyy.bean.Student;
import com.zyy.dao.StuDao;
import com.zyy.db.DbConn;

public class StuDaoImpl implements StuDao {

	public List<Student> stuSelect() {
		Connection conn = DbConn.getConn();
		List<Student> stuList = new ArrayList<Student>();
		try {
			PreparedStatement ps = conn.prepareStatement(SELECT);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Student stu=new Student();
				stu.setStu_id(rs.getInt("stu_id"));
				stu.setStu_name(rs.getString("stu_name"));
				stu.setStu_sex(rs.getString("stu_sex"));
				stu.setStu_age(rs.getInt("stu_age"));
				stu.setStu_address(rs.getString("stu_address"));
				
				stuList.add(stu);
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stuList;
	}

	public Student stuFind(int id) {
		Connection conn = DbConn.getConn();
		Student stu=new Student();
		try {
			PreparedStatement ps = conn.prepareStatement(FIND);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				stu.setStu_id(rs.getInt("stu_id"));
				stu.setStu_name(rs.getString("stu_name"));
				stu.setStu_sex(rs.getString("stu_sex"));
				stu.setStu_age(rs.getInt("stu_age"));
				stu.setStu_address(rs.getString("stu_address"));
			}else{
				System.out.println("此编号不存在");
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stu;
	}

	public int stuDelete(int id) {
		Connection conn = DbConn.getConn();
		int row=0;
		try {
			PreparedStatement ps = conn.prepareStatement(DELETE);
			ps.setInt(1, id);
			row=ps.executeUpdate();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}

	public int stuUpdate(Student stu) {
		return 0;
	}

	public void stuInsert(Student stu) {
		return ;
		
	}

}
