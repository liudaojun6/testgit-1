package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.impl.BuyerImpl;
import com.vo.Buyer;

/**
 * Servlet implementation class servlet_admin_cus
 */
@WebServlet("/servlet_admin_cus")
public class servlet_admin_cus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet_admin_cus() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		BuyerImpl bl = new BuyerImpl();
	    List<Buyer> asd = new ArrayList<>();
	    HttpSession session = request.getSession();
	    try {
	      asd = bl.selectbuyerpw();
	    } catch (Exception exception) {}
	    session.setAttribute("buy", asd);
	    request.getRequestDispatcher("admin_cus.jsp").forward(request, response);
	}

}
