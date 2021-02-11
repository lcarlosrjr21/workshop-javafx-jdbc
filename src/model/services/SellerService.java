package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {

	private SellerDao dao = DaoFactory.createSellerDao();

	public List<Seller> findAll() {

		return dao.findAll();

	}

	public void saveOrUpdate(Seller obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		} else {
			dao.update(obj);
		}
	}
	
	public void remove(Seller obj) {
		dao.deleteById(obj.getId());
	}

	/*
	 * dados MOCK "mokado" List<Seller> list = new ArrayList<>(); list.add(new
	 * Seller(10,"Books")); list.add(new Seller(11,"Computers"));
	 * list.add(new Seller(12,"CDs")); return list;
	 */
}
