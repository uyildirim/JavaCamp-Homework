package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
		void add(Product product);
		void update(Product product);
		void datele(Product product);
		Product get(int id);
		List<Product> getAll();
		
}
