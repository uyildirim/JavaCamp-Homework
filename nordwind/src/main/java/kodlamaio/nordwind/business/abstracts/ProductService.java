package kodlamaio.nordwind.business.abstracts;

import java.util.List;

import kodlamaio.nordwind.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}
