package com.zyy.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.zyy.bean.Student;
import com.zyy.dao.StuDao;
import com.zyy.dao.impl.StuDaoImpl;

public class StuInsert extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		StuDao sd = new StuDaoImpl();
		Student stu=new Student();
    	String stu_id=request.getParameter("stu_id");
		String stu_name=request.getParameter("stu_name");
		String stu_sex=request.getParameter("stu_sex");
		String stu_age=request.getParameter("stu_age");
		String stu_address=request.getParameter("stu_address");
		stu.setStu_id(Integer.parseInt(stu_id));
		stu.setStu_name(stu_name);
		stu.setStu_sex(stu_sex);
		stu.setStu_age(Integer.parseInt(stu_age));
		stu.setStu_address(stu_address);
		sd.stuInsert(stu);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

}
