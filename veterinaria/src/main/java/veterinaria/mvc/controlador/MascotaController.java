package veterinaria.mvc.controlador;

import veterinaria.mvc.modelo.Mascota;
import veterinaria.mvc.service.MascotaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MascotaController {

    private final MascotaService service;

    public MascotaController(MascotaService service) {
        this.service = service;
    }

    @GetMapping("/mascotas")
    public String listar(Model model) {

        model.addAttribute("mascotas", service.obtenerTodas());

        model.addAttribute("nuevaMascota", new Mascota());

        return "mascotas";
    }

    @PostMapping("/mascotas")
    public String registrar(@ModelAttribute Mascota mascota) {

        service.registrar(mascota);

        return "redirect:/mascotas";
    }
}
