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

import com.impl.HistoryImpl;
import com.impl.OrderImpl;
import com.vo.Order;
import com.vo.historyorder;

/**
 * Servlet implementation class servlet_admin_cus_jl
 */
@WebServlet("/servlet_admin_cus_jl")
public class servlet_admin_cus_jl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet_admin_cus_jl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		String buyerid=request.getParameter("buyerid");
		HistoryImpl hl = new HistoryImpl();
		OrderImpl ol =new OrderImpl();
		List<Order> ord =new ArrayList<>();
	    List<historyorder> hord = new ArrayList<>();
	    try {
	      ord = ol.selectorderbuyerid(buyerid);
	    } catch (Exception exception) {}
	    session.setAttribute("ord", ord);
	    try {
		      hord = hl.selecthistoryorderbuyerid(buyerid);
		    } catch (Exception exception) {}
		session.setAttribute("hord", hord);
	    request.getRequestDispatcher("admin_cus_jl.jsp").forward(request, response);
	}

}
