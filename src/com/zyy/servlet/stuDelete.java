package com.zyy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zyy.dao.StuDao;
import com.zyy.dao.impl.StuDaoImpl;

public class stuDelete extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
			String id=request.getParameter("id");
			int stu_id=Integer.parseInt(id);
			
			StuDao sd=new StuDaoImpl();
			int row=sd.stuDelete(stu_id);
			
//			if(row==0){
//				
//			}else {
//				
//			}
			
			request.getRequestDispatcher("StuList").forward(request, response);
//			response.sendRedirect("StuList");
	}

}
