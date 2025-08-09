package model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario") // Nombre exacto de la tabla en la BD
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    @Column(name = "id_persona")
    private int idPersona;

    @Column(name = "nombre_completo", nullable = false, length = 100)
    private String nombreCompleto;

    @Column(name = "correo_electronico", nullable = false, unique = true, length = 100)
    private String correoElectronico;

    @Column(name = "contrasena", nullable = false, length = 255)
    private String contrasena;

    @Column(name = "tipo_usuario", nullable = false, length = 50)
    private String tipoUsuario; // "bibliotecario" o "estudiante"

    public Usuario() {}

    public Usuario(String nombreCompleto, String correoElectronico, String contrasena, String tipoUsuario) {
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.tipoUsuario = tipoUsuario;
    }

    // Getters y setters
    public int getIdPersona() { return idPersona; }
    public void setIdPersona(int idPersona) { this.idPersona = idPersona; }

    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public String getCorreoElectronico() { return correoElectronico; }
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public String getTipoUsuario() { return tipoUsuario; }
    public void setTipoUsuario(String tipoUsuario) { this.tipoUsuario = tipoUsuario; }
}

