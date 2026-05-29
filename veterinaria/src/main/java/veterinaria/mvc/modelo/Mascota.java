package veterinaria.mvc.modelo;

public class Mascota {

    private Long id;
    private String nombre;
    private String especie;
    private String duenio;

    public Mascota(Long id, String nombre, String especie, String duenio) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.duenio = duenio;
    }

    public Mascota() {
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
}
