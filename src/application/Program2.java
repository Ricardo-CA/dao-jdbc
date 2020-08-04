package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = departmentDao.findById(2);
		System.out.println("=========TEST 1 ============ findById======= " + department);
		
		List<Department> list = departmentDao.findAll();
		System.out.println("=======TEST 2 ======= findAll========");
		list.forEach(System.out :: println);
		

	}

}
