package com.excel.classes.jsp.dao;

import java.util.List;

import com.excel.classes.jsp.dataobject.EmployeeDO;

public interface EmployeeDetailDAO{
	/**
	 * 
	 * @param empid
	 * @return
	 */
	public EmployeeDO getEmpDetail(String empid);
	public List<EmployeeDO> getEmployees();
}