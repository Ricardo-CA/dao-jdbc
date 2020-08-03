package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		System.out.println("===== TEST ==== seller finById=========");
		System.out.println(seller);
		
		System.out.println("\n =================TEST 2 =========== findByDepartment======");
		Department department = new Department(null, 2);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(System.out :: println);
		
		System.out.println("\n =================TEST 3 =========== findAll======");
		list = sellerDao.findAll();
		list.forEach(System.out :: println);
		
		}

}
