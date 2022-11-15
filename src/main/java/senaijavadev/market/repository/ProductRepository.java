package senaijavadev.market.repository;

import org.springframework.data.repository.CrudRepository;
import senaijavadev.market.entity.Product;

public interface ProductRepository extends CrudRepository <Product, Integer> {

}
