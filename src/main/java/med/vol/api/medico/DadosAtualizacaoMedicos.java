package med.vol.api.medico;

import jakarta.validation.constraints.NotNull;
import med.vol.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedicos(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
