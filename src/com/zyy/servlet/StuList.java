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

public class StuList extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StuDao sd = new StuDaoImpl();
		List<Student> stuList = sd.stuSelect();
		
		request.setAttribute("stuList",stuList );
		
		request.getRequestDispatcher("stuList.jsp").forward(request, response);
	}

}
