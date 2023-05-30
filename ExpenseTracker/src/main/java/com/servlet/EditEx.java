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
@WebServlet("/edit")
public class EditEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 int id=Integer.parseInt(req.getParameter("id"));
		 String titl=req.getParameter("title");
		 String d=req.getParameter("date");
		 String t=req.getParameter("time");
		 String dec=req.getParameter("desc");
		 String pri=req.getParameter("price");
		 HttpSession s=req.getSession();
		               User u=(User)s.getAttribute("userObj");
		 ExpenseDeatil e=new ExpenseDeatil(id,titl,d,t,dec,pri,u);
		 boolean f=ExpenseDao.updateExpense(e);
		 if(f) {
			 s.setAttribute("msg", "Update SuccesFul");
			 res.sendRedirect("User/viewe.jsp");
		 }else {
			 s.setAttribute("emsg", "Something is Wrong..");
			 res.sendRedirect("User/viewe.jsp");
		 }
	
		 
	}


}
