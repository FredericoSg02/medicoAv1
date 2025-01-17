package com.example.domains.dtos;

import com.example.domains.Medico;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MedicoDTO {

    private long id;

    @NotNull(message = "O campo nome nao pode ser nulo")
    @NotBlank(message = "O campo nome nao pode estar vazio")
    private String nome;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataContratacao = LocalDate.now();

    @NotNull(message = "O campo salario nao pode ser nulo")
    @Digits(integer = 15, fraction = 2)
    private BigDecimal salario;

    public MedicoDTO() {}

    public MedicoDTO(Medico medico) {
        this.id = medico.getId();
        this.nome = medico.getNome();
        this.dataContratacao = medico.getDataContratacao();
        this.salario = medico.getSalario();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public @NotNull(message = "O campo nome nao pode ser nulo") @NotBlank(message = "O campo nome nao pode estar vazio") String getNome() {
        return nome;
    }

    public void setNome(@NotNull(message = "O campo nome nao pode ser nulo") @NotBlank(message = "O campo nome nao pode estar vazio") String nome) {
        this.nome = nome;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public @NotNull(message = "O campo salario nao pode ser nulo") @Digits(integer = 15, fraction = 2) BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(@NotNull(message = "O campo salario nao pode ser nulo") @Digits(integer = 15, fraction = 2) BigDecimal salario) {
        this.salario = salario;
    }
}
