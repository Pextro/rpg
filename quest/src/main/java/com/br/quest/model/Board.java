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
import lombok.*;

@Data
@Entity
@Table(name = "board")
public class Board{

  @Id
  @SequenceGenerator(name = "board_seq", sequenceName = "board_sequence", allocationSize = 0)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "board_seq")
  private Integer id;

  @Column(name = "titulo")
  private String titulo;
}