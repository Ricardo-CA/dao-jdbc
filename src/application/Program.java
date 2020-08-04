package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
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
		
		
		System.out.println("\n =================TEST 4 =========== SellerInsert======");
		Seller newSeller = new Seller(null, "Jorge", "jorge@gmail.com", new Date(), 3000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted new id=" + newSeller.getId());
		
		System.out.println("\n =================TEST 5 =========== Sellerupdate======");

		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update completed");

		System.out.println("\n =================TEST 6 =========== Seller delete======");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
		}

}
