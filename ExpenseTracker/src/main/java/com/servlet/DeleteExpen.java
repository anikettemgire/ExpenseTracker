package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ExpenseDao;
@WebServlet("/delete")
public class DeleteExpen extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		          boolean f=ExpenseDao.deleteExpense(id);
		          HttpSession s=req.getSession();
		          if(f) {
		        	  s.setAttribute("msg", "Delete Succesful...");
		        	  res.sendRedirect("User/viewe.jsp");
		          }else {
		        	  s.setAttribute("emsg", "Something Wrong...");
		        	  res.sendRedirect("User/viewe.jsp");
		          }
	}

}
