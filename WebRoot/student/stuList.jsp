<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="../WEB-INF/c.tld" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'stuList.jsp' starting page</title>
    

  </head>
  
  <body>
  <table border="1" cellpadding="0" cellspacing="0" bordercolor="#000000">
  <tr>
  <th>编号</th>
  <th>姓名</th>
  <th>性别</th>
  <th>年龄</th>
  <th>地址</th>
  <th>操作</th>
  </tr>
  <c:forEach var ="stu"  items="${stuList}">
    <tr>
  <td>${stu.stu_id }</td>
  <td>${stu.stu_name }</td>
  <td>${stu.stu_sex }</td>
  <td>${stu.stu_age }</td>
  <td>${stu.stu_address }</td>
  <td><a href="stuFind?id=${stu.stu_id }">更新</a>  | <a href="stuDelete?id=${stu.stu_id }"> 删除 </a></td>
  </tr>
  </c:forEach>
  </table>
  </body>
</html>
