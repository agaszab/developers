package pl.developers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.developers.mod.DeveloperInfo;

public interface DeveloperInfoRepository extends JpaRepository<DeveloperInfo, Long> {
}
