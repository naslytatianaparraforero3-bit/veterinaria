package veterinaria.mvc.service;

import veterinaria.mvc.modelo.Mascota;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MascotaService {

    private final List<Mascota> mascotas = new ArrayList<>(List.of(
        new Mascota(1L, "Firulais", "Perro",  "Juan Torres"),
        new Mascota(2L, "Michi",   "Gato",   "Laura Ríos"),
        new Mascota(3L, "Bugs",    "Conejo",  "Pedro Salas")
    ));

    public List<Mascota> obtenerTodas() {
        return mascotas;
    }

    public void registrar(Mascota mascota) {
        long nuevoId = mascotas.size() + 1L;
        mascota.setId(nuevoId);
        mascotas.add(mascota);
    }
}
