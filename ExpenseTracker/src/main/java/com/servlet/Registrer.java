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
@WebServlet("/regiter")
public class Registrer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		     String name=req.getParameter("name");
		     String email=req.getParameter("email");
		     String pass=req.getParameter("pass");
		     String cpass=req.getParameter("cpass");
		     HttpSession s=req.getSession();
		     if(pass.equals(cpass)) {
		     String ab=req.getParameter("ab");
		    User u=new User(name,email,pass,ab);
		                    boolean f= UserDao.Save(u);
		                    if(f) {
		                    	 s.setAttribute("msg", "Succesfully Register..");
		                    	 res.sendRedirect("register.jsp");
		                    	
		                    }else {
		               
		                       	s.setAttribute("emsg", "Something Wrong");
		                    	res.sendRedirect("register.jsp");
		                 
		                    }
		     }else {
		    	 s.setAttribute("emsg", "Password Not Match");
		    	 res.sendRedirect("register.jsp");
		    	 
		     }
	}

}
