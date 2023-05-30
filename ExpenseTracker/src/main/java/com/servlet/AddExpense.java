package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ExpenseDao;
import com.entity.ExpenseDeatil;
import com.entity.User;
@WebServlet("/add")
public class AddExpense extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		 String titl=req.getParameter("title");
		 String d=req.getParameter("date");
		 String t=req.getParameter("time");
		 String dec=req.getParameter("desc");
		 String pri=req.getParameter("price");
		 HttpSession s=req.getSession();
		   User u=(User)s.getAttribute("userObj");
		   HttpSession h=req.getSession();
		   ExpenseDeatil ed=new ExpenseDeatil(titl,d,t,dec,pri,u);
		                     boolean f=ExpenseDao.save(ed);
		                     if(f) {
		                    	 h.setAttribute("msg", "Add Succesful");
		                    	 res.sendRedirect("User/adde.jsp");
		                     }else {
		                    	 h.setAttribute("emsg", "something is wrong");
		                    	  res.sendRedirect("User/adde.jsp");
		                     }
		
	}

}
