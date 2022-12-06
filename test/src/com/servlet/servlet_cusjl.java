package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.impl.HistoryImpl;
import com.impl.OrderImpl;
import com.impl.WaresImpl;
import com.vo.Buyer;
import com.vo.Order;
import com.vo.Shop;
import com.vo.Wares;
import com.vo.historyorder;

/**
 * Servlet implementation class servlet_cusjl
 */
@WebServlet("/servlet_cusjl")
public class servlet_cusjl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet_cusjl() {
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
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		Buyer buyer = (Buyer)session.getAttribute("cus");
		String buyerid=buyer.getBuyerid();
		HistoryImpl hl = new HistoryImpl();
		OrderImpl ol =new OrderImpl();
		List<Order> ord =new ArrayList<>();
	    List<historyorder> hord = new ArrayList<>();
	    try {
	      ord = ol.selectorderbuyerid(buyerid);
	    } catch (Exception exception) {}
	    session.setAttribute("ord", ord);
	    System.out.print(ord);
	    try {
		      hord = hl.selecthistoryorderbuyerid(buyerid);
		    } catch (Exception exception) {}
		session.setAttribute("hord", hord);
	    System.out.print(hord);
	    request.getRequestDispatcher("cus_record.jsp").forward((ServletRequest)request, (ServletResponse)response);
	}

}
