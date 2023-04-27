package com.damasceno.clinica.api.medico;

import com.damasceno.clinica.api.endereco.Endereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, Endereco endereco) {

}
