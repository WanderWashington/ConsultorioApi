package med.voll.api.paciente;

import med.voll.api.medico.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPacienteRepository extends JpaRepository<Paciente, Long> {
}
