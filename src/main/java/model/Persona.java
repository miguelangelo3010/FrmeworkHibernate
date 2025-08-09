package model;

import jakarta.persistence.*;

@Entity
@Table(name = "Persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private int id;

    @Column(name = "nombre_completo")
    private String nombreCompleto;

    @Column(name = "correo_electronico", unique = true, nullable = false)
    private String correo;

    @Column(name = "contrasena", nullable = false)
    private String contrasena;

    @Column(name = "foto_perfil")
    private String fotoPerfil;

    @Column(name = "fecha_creacion")
    private java.sql.Timestamp fechaCreacion;

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public String getFotoPerfil() { return fotoPerfil; }
    public void setFotoPerfil(String fotoPerfil) { this.fotoPerfil = fotoPerfil; }

    public java.sql.Timestamp getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(java.sql.Timestamp fechaCreacion) { this.fechaCreacion = fechaCreacion; }
}
