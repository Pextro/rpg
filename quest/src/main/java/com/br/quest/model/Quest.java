package com.br.quest.model;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
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
    @Id
    @SequenceGenerator(name = "quest_seq", sequenceName = "quest_sequence", allocationSize = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    private Integer id;

    @Column(name = "data_cadastro",nullable = false)
    private Date dataCadastro;

    @Column
    private Integer contadorDeadline;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String resumo;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private String recompensa;

    @Column(nullable = false)
    private String dificuldade;

    @Column
    private String evento;

    @Column(nullable = false)
    private Integer passoColuna;

    @OneToMany
    @JoinColumn
    private Board idBoard;

    @Column(nullable = false)
    private String mestre;
}