package kodlamaio.nordwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.nordwind.entities.concretes.Product;

public interface ProductDao  extends JpaRepository<Product,Integer>{

	
}
