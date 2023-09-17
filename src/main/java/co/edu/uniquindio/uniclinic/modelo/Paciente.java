package co.edu.uniquindio.uniclinic.modelo;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Paciente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int codigo;

    private LocalDateTime fechaNacimiento;

    @ElementCollection
    private List<String> alergias;

    @Enumerated(EnumType.STRING)
    private EPS eps;

    @Enumerated(EnumType.ORDINAL)
    private TipoSangre tipoSangre;

}
