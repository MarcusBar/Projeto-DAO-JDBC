package application;


import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program {

	public static void main(String[] args) {
	
		DepartmentDao dep = DaoFactory.createDepartmentDao();


		/*
		System.out.println(dep.findById(5));
		
		List<Department> list = new ArrayList<>();
		list = dep.findAll();
		list.forEach(System.out::println);
		
		Department depart1 = new Department(null, "RH");
		dep.insert(depart1);
		
		dep.deleteById(5);
		*/
	}

}
