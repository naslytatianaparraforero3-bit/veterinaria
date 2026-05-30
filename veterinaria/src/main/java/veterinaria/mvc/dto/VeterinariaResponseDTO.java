package veterinaria.mvc.dto;

public class VeterinariaResponseDTO {
    private Long id;
    private String nombre;
    private String especie;
    private String dueño;
    private String rol;
    private String correo;
    private String contraseña;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getDueño() {
        return dueño;
    }

    public String getRol(){return rol;}

    public String getCorreo (){return correo;}

    public String getContraseña (){return contraseña;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    public  void setRol (String rol){
        this.rol=rol;
    }

    public void setCorreo (String correo ){
        this.correo= correo;
    }
    public void setContraseña(String contraseña){
        this.contraseña=contraseña;
    }


}
