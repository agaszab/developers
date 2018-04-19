package pl.developers.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.developers.mod.Oferta;


public interface OfertaRepository extends JpaRepository<Oferta, Long> {
    }

