<%@page import="com.zyy.dao.impl.StuDaoImpl"%>
<%@page import="com.zyy.dao.StuDao"%>
<%@page import="com.zyy.bean.Student"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'stuInset.jsp' starting page</title>
    
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->


  </head>
 
  <body>
  <form action="student/insertValue.jsp">
<table width="304" height="340" border="1">
  <tr>
    <td width="59">编号</td>
    <td width="97">
      <input type="text" name="stu_id"  />
    </td>
    <td width="22">&nbsp;</td>
  </tr>
  <tr>
    <td>姓名</td>
    <td><input type="text" name="stu_name"  /></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>性别</td>
    <td><input type="text" name="stu_sex" /></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>年龄</td>
    <td><input type="text" name="stu_age"  /></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>地址</td>
    <td><input type="text" name="stu_address"  /></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td colspan="3" align="center" ><input type="submit" value="提交" /><input type="reset" value="重置" /></td>
  </tr>
</table>
</form>
	
  </body>
</html>
