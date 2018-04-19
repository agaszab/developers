package pl.developers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.developers.mod.Developer;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {
    }
