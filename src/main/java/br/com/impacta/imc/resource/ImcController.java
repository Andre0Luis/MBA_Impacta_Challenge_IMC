package br.com.impacta.imc.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.impacta.imc.model.dto.ImcRequestDTO;
import br.com.impacta.imc.model.dto.ImcResponseDTO;
import br.com.impacta.imc.service.ImcService;

@Controller
@RequestMapping("/imc")
public class ImcController {

    private final ImcService imcService;

    public ImcController(ImcService imcService) {
        this.imcService = imcService;
    }

    @GetMapping
    public ResponseEntity<ImcResponseDTO> calculateImc(@RequestBody ImcRequestDTO imcRequestDTO) {

        return ResponseEntity.ok(imcService.calculateImc(imcRequestDTO));
    }

}
