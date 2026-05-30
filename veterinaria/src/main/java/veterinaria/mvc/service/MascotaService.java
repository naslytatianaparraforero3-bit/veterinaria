package veterinaria.mvc.service;

import veterinaria.mvc.Repository.MascotaRepository;
import veterinaria.mvc.dto.VeterinariaRequestDTO;
import veterinaria.mvc.dto.VeterinariaResponseDTO;
import veterinaria.mvc.entity.Mascota;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MascotaService {

    private final MascotaRepository mascotaRepository;

    public MascotaService(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    public VeterinariaResponseDTO registrar(VeterinariaRequestDTO requestDTO) {
        Mascota mascota = new Mascota();
        mascota.setNombre(requestDTO.getNombre());
        mascota.setEspecie(requestDTO.getEspecie());
        mascota.setDueno(requestDTO.getDueño());
        mascota.setCorreo(requestDTO.getCorreo());
        mascota.setContrasena(requestDTO.getContraseña());
        mascota.setRol(requestDTO.getRol());

        mascotaRepository.save(mascota);

        VeterinariaResponseDTO responseDTO = new VeterinariaResponseDTO();
        responseDTO.setId(mascota.getId());
        responseDTO.setNombre(mascota.getNombre());
        responseDTO.setEspecie(mascota.getEspecie());
        responseDTO.setDueño(mascota.getDueno());
        responseDTO.setCorreo(mascota.getCorreo());
        responseDTO.setRol(mascota.getRol());
        return responseDTO;

    }

    public List<VeterinariaResponseDTO> getMascotas(){
        List <Mascota> mascotas = mascotaRepository.findAll();
        List <VeterinariaResponseDTO> list = new ArrayList<>();

        for (Mascota mascota : mascotas) {
            VeterinariaResponseDTO responseDTO = new VeterinariaResponseDTO();
            responseDTO.setId(mascota.getId());
            responseDTO.setNombre(mascota.getNombre());
            responseDTO.setEspecie(mascota.getEspecie());
            responseDTO.setDueño(mascota.getDueno());
            responseDTO.setCorreo(mascota.getCorreo());
            responseDTO.setRol(mascota.getRol());
            list.add(responseDTO);
        }
        return list;
    }
}