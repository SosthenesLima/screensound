package br.com.lima.screensound.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "artista")
public class Artista {
    public Long id;
    public String nome;
    private TipoArtista tipo;
}
