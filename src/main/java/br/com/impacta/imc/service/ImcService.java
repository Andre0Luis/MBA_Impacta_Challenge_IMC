package br.com.impacta.imc.service;

import br.com.impacta.imc.model.dto.ImcRequestDTO;
import br.com.impacta.imc.model.dto.ImcResponseDTO;

/**
 * The ImcService interface provides methods to calculate the IMC (Body Mass Index).
 */
public interface ImcService {

    /**
     * Calculates the IMC (Body Mass Index) based on the provided ImcRequestDTO.
     *
     * @param imcRequestDTO The ImcRequestDTO object containing the necessary data for the calculation.
     * @return The ImcResponseDTO object containing the calculated IMC and additional information.
     */
    ImcResponseDTO calculateImc(ImcRequestDTO imcRequestDTO);

}
