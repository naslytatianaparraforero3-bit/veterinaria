package veterinaria.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import veterinaria.mvc.dto.VeterinariaRequestDTO;
import veterinaria.mvc.entity.Mascota;
import veterinaria.mvc.service.MascotaService;

@Controller
public class MascotaController {

    private final MascotaService mascotaService;

    public MascotaController(MascotaService mascotaService) {
        this.mascotaService = mascotaService;
    }

    @GetMapping({"/", "/mascotas"})
    public String listar(Model model) {
        model.addAttribute("mascotas", mascotaService.getMascotas());
        model.addAttribute("nuevaMascota", new Mascota());
        return "mascotas";
    }

    @PostMapping("/mascotas")
    public String registrar(@ModelAttribute("nuevaMascota") Mascota mascota) {
        VeterinariaRequestDTO requestDTO = new VeterinariaRequestDTO();
        requestDTO.setNombre(mascota.getNombre());
        requestDTO.setEspecie(mascota.getEspecie());
        requestDTO.setDueño(mascota.getDueno());
        requestDTO.setCorreo(mascota.getCorreo());
        requestDTO.setContraseña(mascota.getContrasena());
        requestDTO.setRol(mascota.getRol());

        mascotaService.registrar(requestDTO);
        return "redirect:/mascotas";
    }
}
