package com.br.quest.model;

import java.util.Collection;
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
@Table(name = "character")
public class Character{
    @Id
    @SequenceGenerator(name = "character_seq", sequenceName = "character_sequence", allocationSize = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    private Integer id;

    @Column(name = "nick", nullable = false)
    private String nick;

    @Column(name = "level", nullable = false)
    private Integer level;

    @Column(name = "classe",nullable = false)
    private String classe;

    @Column(name = "sub_class",nullable = false)
    private String subClass;

    @Column(name = "ranking",nullable = false)
    private String ranking;
}