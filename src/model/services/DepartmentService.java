package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class DepartmentService {

	private DepartmentDAO dao = DaoFactory.createDepartmentDao();

	public List<Department> findAll() {

		return dao.findAll();

	}

	public void saveOrUpdate(Department obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		} else {
			dao.update(obj);
		}
	}
	
	public void remove(Department obj) {
		dao.deleteById(obj.getId());
	}

	/*
	 * dados MOCK "mokado" List<Department> list = new ArrayList<>(); list.add(new
	 * Department(10,"Books")); list.add(new Department(11,"Computers"));
	 * list.add(new Department(12,"CDs")); return list;
	 */
}
