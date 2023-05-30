package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.entity.User;
@WebServlet("/login")
public class User_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		  String em=req.getParameter("email");
		  String pa=req.getParameter("pass");
		 HttpSession s=req.getSession();
		                       User u =UserDao.findUser(em, pa);
		                       if(u==null) {
		                    	   s.setAttribute("msg", "Invalid Email & Password");
		                    	   res.sendRedirect("login.jsp");
		                       }else {
		                    	   s.setAttribute("userObj", u);
		                    	   res.sendRedirect("User/user.jsp");
		                    	   
		                       }
		
	}

}
