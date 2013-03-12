package com.excel.classes.jsp.common;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.excel.classes.jsp.dao.EmployeeDetailDAO;
import com.excel.classes.jsp.dao.EmployeeDetailDAOImpl;
import com.excel.classes.jsp.dataobject.EmployeeDO;

/**
 * Servlet implementation class GetEmployeeDetail
 */
@WebServlet( displayName="GetEmployeeDetail" ,name="GetEmployeeDetail" , urlPatterns={"/GetEmployeeDetail"})
public class GetEmployeeDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetEmployeeDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid = (String)request.getParameter("empid");
		String type = (String) request.getParameter("type");
		
		HttpSession session = request.getSession();
		
		EmployeeDetailDAO dao = new EmployeeDetailDAOImpl();
		
//		EmployeeDO empdo = dao.getEmpDetail(empid);
		
		List<EmployeeDO> empdo = dao.getEmployees();
		
//		request.setAttribute("empdetail", empdo);
		
		session.setAttribute("empdetail", empdo);
		
		String dispatcherURL = "";
		if ("employee".equals(type))
			dispatcherURL = "/empdetail.jsp";
		else
			dispatcherURL = "/studdetail.jsp";
		
		RequestDispatcher rd = request.getRequestDispatcher(dispatcherURL);
		rd.forward(request,response);
	}
}