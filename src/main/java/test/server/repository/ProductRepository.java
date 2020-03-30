package test.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.server.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
