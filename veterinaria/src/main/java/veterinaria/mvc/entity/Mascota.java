package veterinaria.mvc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mascotas")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "especie")
    private String especie;

    @Column(name = "dueno")
    private String dueño;

    @Column(name = "rol")
    private String rol;

    @Column(name = "correo")
    private String correo;

    @Column(name = "contrasena")
    private String contrasena;

    public Mascota(Long id, String nombre, String especie, String dueño, String correo, String contrasena, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.dueño = dueño;
        this.correo = correo;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public Mascota() {
    }

    public Long getId() { return id; }

    public String getNombre() { return nombre; }

    public String getEspecie() { return especie; }

    public String getDueno() { return dueño; }

    public String getRol() { return rol; }

    public String getCorreo() { return correo; }

    public String getContrasena() { return contrasena; }

    public void setId(Long id) { this.id = id; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setEspecie(String especie) { this.especie = especie; }

    public void setDueno(String dueno) { this.dueño = dueño; }

    public void setRol(String rol) { this.rol = rol; }

    public void setCorreo(String correo) { this.correo = correo; }

    public void setContrasena(String contrasena) { this.contrasena = contrasena; }
}
