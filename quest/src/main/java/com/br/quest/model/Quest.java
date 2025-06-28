package com.br.quest.model;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "quest")
public class Quest{
    private Integer id;
    private Date dataCadastro;
    private Integer contadorDeadline;
    private String titulo;
    private String resumo;
    private String descricao;
    private String recompensa;
    private String dificuldade;
    private String evento;
    private Integer passoColuna;
    private Board idBoard;
    private String mestre;
}