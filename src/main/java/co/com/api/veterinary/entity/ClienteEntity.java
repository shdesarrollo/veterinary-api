package co.com.api.veterinary.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(schema = "CLIENTE")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdCliente;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "TELEFONO")
    private Integer telefono;

    @Column(name = "CORREO")
    private String correo;

}
