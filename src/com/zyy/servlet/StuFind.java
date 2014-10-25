package com.zyy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zyy.bean.Student;
import com.zyy.dao.StuDao;
import com.zyy.dao.impl.StuDaoImpl;

public class StuFind extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String st = request.getParameter("id");
		int id = Integer.parseInt(st);

		StuDao sd = new StuDaoImpl();
		Student stu = sd.stuFind(id);

		request.setAttribute("stu", stu);
		
//		response.sendRedirect("stuFind.jsp");
		request.getRequestDispatcher("stuFind.jsp").forward(request	,response);
	}

}
