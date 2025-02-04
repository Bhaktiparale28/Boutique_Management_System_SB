package cts.project.sprint2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cts.project.sprint2.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
	List<Product> findAllByCategory_Id(int id);

	

}
