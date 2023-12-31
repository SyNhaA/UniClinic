package co.edu.uniquindio.uniclinic.repositorios;

import co.edu.uniquindio.uniclinic.modelo.entidades.Incapacidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IncapacidadRepo extends JpaRepository<Incapacidad, Integer> {

    Optional<Incapacidad> findByAtencionMedicaCodigo(int codigoAtencion);

}
