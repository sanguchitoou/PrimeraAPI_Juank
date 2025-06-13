package PrimeraAPI_JuanCarlos.DEV_JuanCarlos.Models.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TBUSUARIO")
public class DTOUsuario {

    @Id
    @Getter @Setter @Column(name = "IDUSUARIO")
    private Long id;

    @Getter @Setter @Column(name = "NOMBRE")
    private String nombre;

    @Getter @Setter @Column(name = "APELLIDO")
    private String apellido;
}
