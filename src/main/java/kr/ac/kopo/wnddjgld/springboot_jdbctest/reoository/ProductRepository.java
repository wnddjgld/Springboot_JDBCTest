package kr.ac.kopo.wnddjgld.springboot_jdbctest.reoository;

import kr.ac.kopo.wnddjgld.springboot_jdbctest. domain. Product;
import org. springframework.data.jpa.repository. JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}