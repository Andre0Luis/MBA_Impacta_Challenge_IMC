package br.com.impacta.imc.model.dto;

import br.com.impacta.imc.model.Enums.ImcEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImcResponseDTO {

    private Double peso;
    private Double altura;
    private ImcEnum resultado;

}
