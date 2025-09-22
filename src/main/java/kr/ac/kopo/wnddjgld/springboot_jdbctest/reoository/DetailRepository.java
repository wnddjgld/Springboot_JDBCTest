package kr.ac.kopo.wnddjgld.springboot_jdbctest.reoository;

import kr.ac.kopo.wnddjgld.springboot_jdbctest.domain.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepository extends JpaRepository<Detail, Integer> {

}