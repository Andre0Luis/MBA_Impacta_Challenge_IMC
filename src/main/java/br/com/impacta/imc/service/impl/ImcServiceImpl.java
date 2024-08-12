package br.com.impacta.imc.service.impl;

import org.springframework.stereotype.Service;

import br.com.impacta.imc.model.Enums.ImcEnum;
import br.com.impacta.imc.model.dto.ImcRequestDTO;
import br.com.impacta.imc.model.dto.ImcResponseDTO;
import br.com.impacta.imc.service.ImcService;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class ImcServiceImpl implements ImcService {


    @Override
    public ImcResponseDTO calculateImc(ImcRequestDTO imcRequestDTO) {

            try{

            Double imc = imcRequestDTO.getPeso() / (imcRequestDTO.getAltura() * imcRequestDTO.getAltura());

            ImcEnum imcEnum = ImcEnum.NORMAL;
            
            if (imc < 18.5) {
                imcEnum = ImcEnum.MAGREZA;
            } else if (imc >= 18.5 && imc < 24.9) {
                imcEnum = ImcEnum.NORMAL;
            } else if (imc >= 24.9 && imc < 30) {
                imcEnum = ImcEnum.SOBREPESO;
            } else if (imc >= 30) {
                imcEnum = ImcEnum.OBESIDADE;
            }

            return new ImcResponseDTO(imcRequestDTO.getPeso(), imcRequestDTO.getAltura(), imcEnum);

        } catch (Exception e) {

            log.error("Detail Error: ", e);

            throw new RuntimeException("Error to calculate IMC", e);
        }
    }


}
