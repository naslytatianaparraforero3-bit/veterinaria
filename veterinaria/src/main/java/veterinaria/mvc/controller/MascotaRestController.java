package veterinaria.mvc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import veterinaria.mvc.dto.VeterinariaRequestDTO;
import veterinaria.mvc.dto.VeterinariaResponseDTO;
import veterinaria.mvc.service.MascotaService;

import java.util.List;

@RestController
@RequestMapping("/veterinario")
public class MascotaRestController {

    private final MascotaService mascotaService;

    public MascotaRestController(MascotaService mascotaService) {
        this.mascotaService = mascotaService;
    }

    @PostMapping("/mascotas")
    public ResponseEntity<VeterinariaResponseDTO> register(@RequestBody VeterinariaRequestDTO requestDTO) {
        return ResponseEntity.ok(mascotaService.registrar(requestDTO));
    }

    @GetMapping("/mascotas")
    public ResponseEntity<List<VeterinariaResponseDTO>> listar() {
        return ResponseEntity.ok(mascotaService.getMascotas());
    }
}
