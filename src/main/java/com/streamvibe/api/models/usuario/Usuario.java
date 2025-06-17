package com.streamvibe.api.models.usuario;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

// Nome, data de nascimento, email, senha, cpf => Tudo String
public class Usuario {
    private String nome;
    private String dataNascimento;
    private String email;
    private String senha;
    private String cpf;

    public Filme (DadosCadastroUsuario dados) {
        this.nome = dados.nome();
        this.dataNascimento = dados.dataNascimento();
        this.email = dados.email();
        this.senha = dados.senha();
        this.cpf = dados.cpf();
    }
    
}
