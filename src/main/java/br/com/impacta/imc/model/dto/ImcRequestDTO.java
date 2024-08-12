package br.com.impacta.imc.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImcRequestDTO {

    private Double peso;
    private Double altura;

}
