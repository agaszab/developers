package pl.developers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.developers.mod.Inwestycja;

public interface InwestycjaRepository extends JpaRepository<Inwestycja, Long> {
}
