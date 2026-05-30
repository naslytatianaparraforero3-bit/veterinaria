package veterinaria.mvc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import veterinaria.mvc.entity.Mascota;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {
}
