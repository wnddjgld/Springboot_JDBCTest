package kr.ac.kopo.wnddjgld.springboot_jdbctest.repository;

import kr.ac.kopo.wnddjgld.springboot_jdbctest.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}